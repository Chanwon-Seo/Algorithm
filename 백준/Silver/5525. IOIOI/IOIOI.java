import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		String input = br.readLine();
		int ans = 0;
		for (int i = 0; i < m; i++) {
			if (input.charAt(i) == 'I') {

				int tmp = i;
				int cnt = 0;
				while (tmp + 2 < m) {
					if (input.charAt(tmp + 1) == 'O' && input.charAt(tmp + 2) == 'I') {
						cnt++;
						tmp += 2;
						if (cnt == n) {
							cnt--;
							ans++;
						}
					} else {
						break;
					}
				}
				i = tmp;
			}
		}
		System.out.println(ans);
	}
}