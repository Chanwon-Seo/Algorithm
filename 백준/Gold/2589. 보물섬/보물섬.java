import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] map;
    static boolean[][] visited;
    static Queue<Point> Q = new LinkedList<>();

    static class Point {
        int x, y, move;

        public Point(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == 'L') {
                    map[i][j] = true;
                    continue;
                }
                map[i][j] = false;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j]) {
                    bfs(i, j);
                }
            }
        }
        System.out.println(max);
    }

    static void bfs(int x, int y) {
        visited = new boolean[N][M];
        int cnt = 0;
        Q.offer(new Point(x, y, 0));
        visited[x][y] = true;

        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                if (isRoundCheck(nx, ny) && !visited[nx][ny] && map[nx][ny]) {
                    Q.offer(new Point(nx, ny, p.move + 1));
                    visited[nx][ny] = true;
                    cnt = Math.max(cnt, p.move + 1);
                }
            }
        }
        max = Math.max(max, cnt);
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}