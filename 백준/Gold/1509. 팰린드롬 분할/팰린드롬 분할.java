import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		boolean[][] p = new boolean[input.length() + 1][input.length() + 1];
		int[] f = new int[input.length() + 1];

		for (int i = 1; i <= input.length(); i++) {
			p[i][i] = true;
		}

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= input.length(); i++) {
			int min = f[i - 1] + 1;

			for (int j = 1; j < i; j++) {
				if (input.charAt(j - 1) == input.charAt(i - 1)) {
					if (j + 1 == i || p[j + 1][i - 1]) {
						p[j][i] = true;
						min = Math.min(min, f[j - 1] + 1);
					}
				}
			}
			f[i] = min;
		}

		System.out.println(f[input.length()]);
	}
}