import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int ti = 0; ti < t; ti++) {
			int k = Integer.parseInt(br.readLine());
			int[] files = new int[k + 1];
			int[][] dp = new int[k + 1][k + 1];

			StringTokenizer st = new StringTokenizer(br.readLine());
			files[1] = Integer.parseInt(st.nextToken());
			for (int i = 2; i <= k; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				files[i] = tmp + files[i - 1];
			}

			for (int gap = 1; gap < k; gap++) {
				for (int start = 1; start + gap <= k; start++) {
					int end = start + gap;
					dp[start][end] = Integer.MAX_VALUE;

					for (int mid = start; mid < end; mid++) {
						dp[start][end] = Math.min(dp[start][end],
							dp[start][mid] + dp[mid + 1][end] + files[end] - files[start - 1]);
					}
				}
			}
			System.out.println(dp[1][k]);
		}
	}
}