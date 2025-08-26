import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[c + 101];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 0; i < n; i++) {
			int cost = arr[i][0];
			int value = arr[i][1];
			for (int j = value; j < c + 101; j++) {
				if (dp[j - value] != Integer.MAX_VALUE) {
					dp[j] = Math.min(dp[j - value] + cost, dp[j]);
				}
			}
		}

		int ans = Integer.MAX_VALUE;
		for (int i = c; i < c + 101; i++) {
			ans = Math.min(ans, dp[i]);
		}

		System.out.println(ans);

	}

}