import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[] visited;
	static List<Integer>[] map;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n + 1][2];
		visited = new boolean[n + 1];
		map = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			map[i] = new ArrayList<>();
		}

		for (int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[start].add(end);
			map[end].add(start);
		}

		dfs(1);
		System.out.println(Math.min(dp[1][0], dp[1][1]));
	}

	static void dfs(int number) {
		visited[number] = true;
		dp[number][0] = 0;
		dp[number][1] = 1;

		for (int child : map[number]) {
			if (!visited[child]) {
				dfs(child);
				dp[number][0] += dp[child][1];
				dp[number][1] += Math.min(dp[child][0],
					dp[child][1]);
			}
		}
	}
}