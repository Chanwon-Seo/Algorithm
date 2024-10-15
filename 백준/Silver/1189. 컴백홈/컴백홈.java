import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] map;
    static boolean[][] visited;
    static int R, C, K, cnt;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new boolean[R][C];
        visited = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < C; j++) {
                if (input.charAt(j) == 'T') map[i][j] = true;
            }
        }
        visited[R - 1][0] = true;
        dfs(R - 1, 0, 1);
        System.out.println(cnt);
    }

    static void dfs(int x, int y, int depth) {
        if (depth == K && x == 0 && y == C - 1) {
            cnt++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (0 > nx || nx >= R || 0 > ny || ny >= C) continue;
            if (!map[nx][ny] && !visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, depth + 1);
                visited[nx][ny] = false;
            }
        }

    }
}