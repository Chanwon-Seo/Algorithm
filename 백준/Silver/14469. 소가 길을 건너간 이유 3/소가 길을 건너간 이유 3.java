import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int lastTime = 0;
		int[][] cows = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cows[i][0] = Integer.parseInt(st.nextToken());
			cows[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(cows, (o1, o2) -> o1[0] - o2[0]);

		for (int i = 0; i < N; i++) {
			if (lastTime < cows[i][0])
				lastTime = cows[i][0] + cows[i][1];
			else
				lastTime += cows[i][1];
		}
		System.out.println(lastTime);
	}
}