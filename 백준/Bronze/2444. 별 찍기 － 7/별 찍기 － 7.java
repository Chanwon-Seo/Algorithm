import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			starsPattern(n, i, sb);
			sb.append("\n");
		}
		for (int i = n - 1; i >= 1; i--) {
			starsPattern(n, i, sb);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void starsPattern(int n, int i, StringBuilder sb) {
		for (int j = 1; j <= n - i; j++) {
			sb.append(" ");
		}
		for (int j = 1; j <= 2 * i - 1; j++) {
			sb.append("*");
		}
	}
}
