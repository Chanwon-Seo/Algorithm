import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, K, M;
	static int[][] map;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		dp = new int[N][M];
		for (int i = 0; i < N; i++) {
			Arrays.fill(dp[i], -1);
		}

		for (int i = 0, idx = 1; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = idx++;
			}
		}

		if (K == 0) {
			System.out.println((long)BFS(0, 0, N - 1, M - 1));
		} else {
			System.out.println(
				(long)BFS(0, 0, (K - 1) / M, (K - 1) % M) * (long)BFS((K - 1) / M, (K - 1) % M, N - 1, M - 1));

		}

	}

	static long BFS(int r, int c, int targetR, int targetC) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {r, c});
		int[] dx = {1, 0};
		int[] dy = {0, 1};
		long wayCnt = 0;
		while (!q.isEmpty()) {
			int[] temp = q.poll();

			if (temp[0] == targetR && temp[1] == targetC) {
				wayCnt += 1;
				continue;
			}
			for (int dir = 0; dir < 2; dir++) {
				int nr = temp[0] + dx[dir];
				int nc = temp[1] + dy[dir];
				if (nr < 0 || nr >= targetR + 1 || nc < 0 || nc >= targetC + 1) {
					continue;
				}
				q.offer(new int[] {nr, nc});
			}
		}

		return wayCnt;
	}

}