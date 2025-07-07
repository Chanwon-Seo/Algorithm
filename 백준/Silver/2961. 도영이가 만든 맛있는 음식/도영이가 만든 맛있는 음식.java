import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int min;
	static boolean[] validated;
	static int[][] map;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		validated = new boolean[N];
		min = Integer.MAX_VALUE;
		map = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map[i][0] = Integer.parseInt(st.nextToken());
			map[i][1] = Integer.parseInt(st.nextToken());
		}

		subSet(0, 1, 0);

		System.out.println(min);
	}

	static void subSet(int cnt, int mulSour, int sumBitter) {
		if (cnt == N) {
			int falseCnt = 0;
			for (int i = 0; i < N; i++) {
				if (validated[i])
					continue;
				falseCnt++;
			}
			if (falseCnt == N)
				return;
			min = Math.min(min, Math.abs(mulSour - sumBitter));
			return;
		}

		validated[cnt] = true;
		subSet(cnt + 1, mulSour * map[cnt][0], sumBitter + map[cnt][1]);
		validated[cnt] = false;
		subSet(cnt + 1, mulSour, sumBitter);
	}
}