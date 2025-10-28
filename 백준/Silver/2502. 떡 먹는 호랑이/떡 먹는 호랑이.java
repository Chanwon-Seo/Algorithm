import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		if (d == 3) {
			System.out.println("1\n" + (k - 1) + "\n");
			return;
		}

		int[] a1 = new int[d + 1];
		int[] a2 = new int[d + 1];

		a1[3] = a2[3] = 1;
		a1[4] = 1;
		a2[4] = 2;

		for (int i = 5; i <= d; i++) {
			a1[i] = a1[i - 1] + a1[i - 2];
			a2[i] = a2[i - 1] + a2[i - 2];
		}

		int first = 0;
		int second = 0;

		for (int i = 1; ; i++) {
			int res = k - a1[d] * i;

			if (res % a2[d] == 0) {
				first = i;
				second = res / a2[d];
				break;
			}

		}

		System.out.println(first + "\n" + second + "\n");
	}
}