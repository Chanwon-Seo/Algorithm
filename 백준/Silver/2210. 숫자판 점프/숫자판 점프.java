import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map = new int[5][5];
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, String.valueOf(map[i][j]));
            }
        }

        System.out.println(set.size());
    }

    static void dfs(int x, int y, int digit, String num) {
        if (digit == 5) {
            set.add(num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (0 > nx || nx >= 5 || 0 > ny || ny >= 5) continue;
            dfs(nx, ny, digit + 1, num + map[nx][ny]);
        }
    }
}