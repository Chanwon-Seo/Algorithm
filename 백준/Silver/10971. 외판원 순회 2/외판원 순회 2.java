import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] map;
	static boolean[] visit;
	static int result = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N + 1][N + 1];
		visit = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visit[1] = true;
		back(1, 1, 1, 0);
		System.out.println(result);
	}

	static void back(int start, int now, int count, int cost) {
		if (map[now][start] != 0 && count == N) {
			result = Math.min(result, cost + map[now][start]);
			return;
		}
		for (int next = 1; next <= N; next++) {
			if (map[now][next] > 0 && !visit[next]) {
				visit[next] = true;
				back(start, next, count + 1, cost + map[now][next]);
				visit[next] = false;

			}
		}
	}
}
