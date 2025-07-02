import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int N, M, R, count = 1;
	static int[] result;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> map = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		result = new int[N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i <= N; i++) {
			map.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			map.get(u).add(v);
			map.get(v).add(u);
		}

		dfs(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(result[i]).append("\n");
		}

		System.out.println(sb);

	}

	static void dfs(int cur) {
		visited[cur] = true;
		result[cur] = count++;
		Collections.sort(map.get(cur), Collections.reverseOrder());
		for (Integer value : map.get(cur)) {
			if (!visited[value]) {
				dfs(value);
			}
		}
	}
}