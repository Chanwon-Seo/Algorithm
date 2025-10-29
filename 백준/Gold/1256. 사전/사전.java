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
		StringBuilder sb = new StringBuilder();
		long[][] dp = new long[n + m + 1][n + m + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= n + m; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
			for (int j = 1; j < i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				if (dp[i][j] > 1000000000) {
					dp[i][j] = 1000000001;
				}
			}
		}

		if (dp[n + m][n] < k) {
			System.out.println(-1);
			return;
		}

		while (n != 0 || m != 0) {
			if (dp[n + m - 1][m] >= k) {
				sb.append("a");
				n--;
			} else {
				sb.append("z");
				k -= dp[n + m - 1][m];
				m--;
			}
		}
		System.out.println(sb);
	}
}
