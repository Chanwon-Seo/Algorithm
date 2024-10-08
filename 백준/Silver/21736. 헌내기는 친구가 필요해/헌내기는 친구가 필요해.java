import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cnt;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] visited;
    static Queue<Point> Q = new LinkedList<>();

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
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map[i] = st.nextToken().toCharArray();
            for (int j = 0; j < M; j++) {
                if ('I' == map[i][j]) Q.offer(new Point(i, j));
            }
        }
        bfs();
        if (cnt == 0) System.out.println("TT");
        else System.out.println(cnt);
    }

    static void bfs() {
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            visited[p.x][p.y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                if (isRoundCheck(nx, ny) && !visited[nx][ny] && map[nx][ny] != 'X') {
                    if (map[nx][ny] == 'P') {
                        cnt++;
                    }
                    Q.offer(new Point(nx, ny));
                    visited[nx][ny] = true;
                }

            }
        }
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

}