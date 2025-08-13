import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;

	static class Wire implements Comparable<Wire> {
		int from, to;

		public Wire(int from, int to) {
			this.from = from;
			this.to = to;
		}

		@Override
		public int compareTo(Wire w) {
			return this.from - w.from;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		Wire[] wires = new Wire[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			wires[i] = new Wire(from, to);
		}

		Arrays.sort(wires);

		int[] dp = new int[N];
		Arrays.fill(dp, 1);

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {

				if (wires[j].to < wires[i].to && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;

				}
			}
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, dp[i]);
		}

		System.out.println(N - max);

	}

}