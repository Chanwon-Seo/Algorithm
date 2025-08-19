import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] dp = new int[n][m];

		int kI = 0;
		int kJ = 0;
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 1;
				else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}

				if (cnt == k) {
					kI = i;
					kJ = j;
				}
				cnt++;
			}
		}

		System.out.println(dp[kI][kJ] * dp[n - kI - 1][m - kJ - 1]);

	}

}