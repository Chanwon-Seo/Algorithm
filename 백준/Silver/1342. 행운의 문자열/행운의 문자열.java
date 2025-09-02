import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] map = new int[27];
	static int count, length;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		length = input.length();

		for (int i = 0; i < input.length(); i++) {
			map[input.charAt(i) - 'a']++;
		}

		dfs(0, ' ');
		System.out.println(count);
	}

	static void dfs(int index, char pre) {
		if (index == length) {
			count++;
			return;
		}
		for (int i = 0; i < 27; i++) {
			if (map[i] == 0) {
				continue;
			}

			if (pre != (char)(i + 'a')) {
				map[i]--;
				dfs(index + 1, (char)(i + 'a'));
				map[i]++;
			}
		}
	}
}