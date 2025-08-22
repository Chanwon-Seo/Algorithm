import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		int n = text.length();
		int[][] s = new int[26][n + 1];

		for (int i = 1; i <= n; i++) {
			int index = text.charAt(i - 1) - 'a';
			for (int j = 0; j < 26; j++) {
				s[j][i] = s[j][i - 1];
			}
			s[index][i]++;
		}
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int index = st.nextToken().charAt(0) - 'a';
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int count = s[index][r + 1] - s[index][l];
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}