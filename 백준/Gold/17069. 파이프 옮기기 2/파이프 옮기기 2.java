import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] map = new int[n + 1][n + 1];
		long[][][] dp = new long[n + 1][n + 1][4];

		for (int i = 1; i < n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[1][2][1] = 1;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 3; j < n + 1; j++) {
				if (map[i][j] == 1) {
					continue;
				}

				dp[i][j][1] = dp[i][j - 1][1] + dp[i][j - 1][2];

				dp[i][j][3] = dp[i - 1][j][2] + dp[i - 1][j][3];

				if (map[i][j - 1] == 0 && map[i - 1][j] == 0) {
					dp[i][j][2] = dp[i - 1][j - 1][1] + dp[i - 1][j - 1][2] + dp[i - 1][j - 1][3];
				}

			}
		}
		System.out.println(dp[n][n][1] + dp[n][n][2] + dp[n][n][3]);
	}
}
