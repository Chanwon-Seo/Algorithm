import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map = new int[5][5];
    static int R = 5, C = 5, ans;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int px = Integer.parseInt(st.nextToken());
        int py = Integer.parseInt(st.nextToken());
        dfs(px, py, 0, 0);
        System.out.println(ans);
    }

    static void dfs(int x, int y, int depth, int cnt) {
        if (map[x][y] == 1) {
            cnt++;
        }
        if (depth == 3) {
            if (cnt >= 2) ans = 1;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (0 > nx || nx >= R || 0 > ny || ny >= C) continue;
            if (map[nx][ny] == -1) continue;

            map[x][y] = -1;
            dfs(nx, ny, depth + 1, cnt);
            map[x][y] = 0;

        }
    }
}