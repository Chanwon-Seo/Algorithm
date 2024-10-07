import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, L, R, day;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Point> list;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(move());
    }

    static int move() {
        while (true) {
            boolean isMove = false;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        int sum = bfs(i, j);
                        if (list.size() > 1) {
                            int avg = sum / list.size();
                            for (Point p : list) {
                                map[p.x][p.y] = avg;
                            }
                            isMove = true;
                        }
                    }
                }
            }
            if (!isMove) {
                return day;
            }
            day++;
        }
    }

    static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        list = new ArrayList<>();

        q.offer(new Point(x, y));
        list.add(new Point(x, y));
        visited[x][y] = true;

        int sum = map[x][y];
        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                if (isRoundCheck(nx, ny) && !visited[nx][ny]) {
                    int result = Math.abs(map[nx][ny] - map[p.x][p.y]);
                    if (L <= result && result <= R) {
                        q.offer(new Point(nx, ny));
                        list.add(new Point(nx, ny));
                        visited[nx][ny] = true;
                        sum += map[nx][ny];
                    }
                }
            }
        }
        return sum;
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}
