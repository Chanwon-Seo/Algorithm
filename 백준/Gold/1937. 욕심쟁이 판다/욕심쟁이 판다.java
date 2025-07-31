import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int N;
	static int[][] map;
	static int[][] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		dp = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				ans = Math.max(ans, dfs(i, j));
			}
		}

		System.out.println(ans);
	}

	static int dfs(int x, int y) {
		if (dp[x][y] != 0) {
			return dp[x][y];
		}

		dp[x][y] = 1;

		int dx, dy;
		for (int i = 0; i < 4; i++) {
			dx = x + Main.dx[i];
			dy = y + Main.dy[i];

			if (dx < 0 || dy < 0 || dx >= N || dy >= N) {
				continue;
			}

			if (map[x][y] < map[dx][dy]) {
				dp[x][y] = Math.max(dp[x][y], dfs(dx, dy) + 1);
				dfs(dx, dy);
			}
		}
		return dp[x][y];
	}

}