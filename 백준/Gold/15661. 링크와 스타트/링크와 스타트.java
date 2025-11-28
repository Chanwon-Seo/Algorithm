import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] ability;
	static boolean[] check;
	static int N, minValue = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		ability = new int[N][N];
		check = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				ability[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		linkAndStart(0);

		System.out.println(minValue);
	}

	static void linkAndStart(int depth) {
		if (depth == N) {
			int tempLink = 0;
			int tempStart = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (check[i] != check[j])
						continue;
					if (check[i])
						tempLink += ability[i][j] + ability[j][i];
					else
						tempStart += ability[i][j] + ability[j][i];
				}
			}

			minValue = Math.min(minValue, Math.abs(tempLink - tempStart));
			return;
		}
		check[depth] = true;
		linkAndStart(depth + 1);
		check[depth] = false;
		linkAndStart(depth + 1);

	}
}