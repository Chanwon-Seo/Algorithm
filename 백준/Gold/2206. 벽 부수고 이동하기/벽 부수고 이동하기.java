import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static boolean[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];
        visited = new boolean[2][N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < M; j++) {
                if ('1' == input.charAt(j)) map[i][j] = true;
            }
        }
        System.out.print(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 0, 1}); //x, y, crush, move
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            if (cur[0] == N - 1 && cur[1] == M - 1) {
                return cur[3];
            }

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + cur[0];
                int ny = dy[i] + cur[1];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if (map[nx][ny]) {
                    if (cur[2] == 0 && !visited[1][nx][ny]) {
                        visited[cur[2]][nx][ny] = true;
                        q.offer(new int[]{nx, ny, 1, cur[3] + 1});
                    }
                } else {
                    if (!visited[cur[2]][nx][ny]) {
                        visited[cur[2]][nx][ny] = true;
                        q.offer(new int[]{nx, ny, cur[2], cur[3] + 1});
                    }
                }
            }
        }
        return -1;
    }

}
