import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, year = 0;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;

    static class IceBerg {
        int x, y;

        public IceBerg(int x, int y) {
            this.x = x;
            this.y = y;
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

        while (true) {
            visited = new boolean[N][M];
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visited[i][j] && map[i][j] > 0) {
                        searchIceBerg(i, j);
                        cnt++;
                    }
                }
            }

            if (cnt == 0) {
                year = 0;
                break;
            } else if (cnt >= 2) {
                break;
            }

            melting();
            year++;
        }
        System.out.println(year);
    }

    static void melting() {
        Queue<IceBerg> q = new LinkedList<>();
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0) {
                    q.offer(new IceBerg(i, j));
                    visited[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            IceBerg ice = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + ice.x;
                int ny = dy[i] + ice.y;
                if (isRoundCheck(nx, ny) && map[nx][ny] <= 0 && !visited[nx][ny]) {
                    map[ice.x][ice.y]--;
                }
            }
        }
    }

    static void searchIceBerg(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (isRoundCheck(nx, ny) && map[nx][ny] > 0 && !visited[nx][ny]) {
                searchIceBerg(nx, ny);
            }
        }

    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

}