import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int ti = 0; ti < t; ti++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int a = n;
			int b = m;
			int tmp = 0;
			while (b != 0) {
				tmp = b;
				b = a % b;
				a = tmp;
			}

			int lcm = m * n / a;
			int answer = -1;

			for (int i = x - 1; i < lcm + 1; i += m) {
				if (i % n == y - 1) {
					answer = i;
					break;
				}
			}
			sb.append(answer + 1 != 0 ? answer + 1 : -1).append('\n');
		}
		System.out.println(sb);

	}
}