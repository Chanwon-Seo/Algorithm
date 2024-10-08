import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, ans;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dx = {-1, 1, 0, 0, -1, 1, 1, -1};
    static int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};
    static int[][] map;
    static boolean[][] visited;

    static class Point {
        int x, y, s;

        public Point(int x, int y, int s) {
            this.x = x;
            this.y = y;
            this.s = s;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    ans = Math.max(bfs(i, j), ans);
                }
            }
        }

        System.out.print(ans);
    }

    static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y, 0));
        visited = new boolean[N][M];
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                int move = p.s + 1;
                if (isRoundCheck(nx, ny) && !visited[nx][ny]) {
                    if (map[nx][ny] == 1) {
                        return move;
                    }
                    q.offer(new Point(nx, ny, move));
                    visited[nx][ny] = true;
                }
            }
        }

        return 0;
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

}