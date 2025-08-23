import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static ArrayList<ArrayList<Integer>> map;
	static int ans;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		map = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			map.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			map.get(x).add(y);
			map.get(y).add(x);
		}

		ans = 0;
		visited = new boolean[N + 1];
		DFS(1, 0, visited);

		System.out.println((ans % 2 == 0) ? "No" : "Yes");
	}

	static void DFS(int node, int cnt, boolean[] visited) {
		visited[node] = true;
		for (int next : map.get(node)) {
			if (!visited[next]) {
				DFS(next, cnt + 1, visited);
			}
		}

		if (node != 1 && map.get(node).size() == 1) {
			ans += cnt;
		}
	}
}