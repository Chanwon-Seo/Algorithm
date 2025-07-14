import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static boolean[] visited;
	static int[][] map;

	static int MIN_RESULT = Integer.MAX_VALUE;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	;

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		visited = new boolean[N + 1];
		map = new int[N + 1][N + 1];

		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		combination(0, 1);
		System.out.println(MIN_RESULT);
	}

	static void combination(int dep, int start) {
		if (dep == N / 2) {
			MIN_RESULT = Math.min(MIN_RESULT, getResult());
			return;
		}

		for (int i = start; i <= N; i++) {
			visited[i] = true;
			combination(dep + 1, i + 1);
			visited[i] = false;
		}
	}

	static int getResult() {
		int start = 0;
		int link = 0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j)
					continue;

				if (visited[i] && visited[j])
					start += map[i][j];
				if (!visited[i] && !visited[j])
					link += map[i][j];
			}
		}
		return Math.abs(start - link);
	}
}