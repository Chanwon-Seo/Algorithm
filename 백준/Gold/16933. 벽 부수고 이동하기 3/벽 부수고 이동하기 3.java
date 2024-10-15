import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, K;
    static boolean[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y, move, crush;
        boolean DN;

        public Point(int x, int y, int move, int crush, boolean DN) {
            this.x = x;
            this.y = y;
            this.move = move;
            this.crush = crush;
            this.DN = DN;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];
        visited = new boolean[K + 1][N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < M; j++) {
                if ('1' == input.charAt(j)) map[i][j] = true;
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0, 1, 0, true));
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x == N - 1 && p.y == M - 1) return p.move;

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                int nextMove = p.move + 1;

                if (0 > nx || nx >= N || 0 > ny || ny >= M) continue;

                if (map[nx][ny]) {
                    if (p.DN && p.crush < K && !visited[p.crush + 1][nx][ny]) {
                        visited[p.crush + 1][nx][ny] = true;
                        q.offer(new Point(nx, ny, nextMove, p.crush + 1, !p.DN));
                    } else if (p.crush < K && !p.DN) {
                        q.offer(new Point(p.x, p.y, nextMove, p.crush, !p.DN));
                    }
                } else {
                    if (!visited[p.crush][nx][ny]) {
                        visited[p.crush][nx][ny] = true;
                        q.offer(new Point(nx, ny, nextMove, p.crush, !p.DN));
                    }
                }
            }
        }

        return -1;
    }

}