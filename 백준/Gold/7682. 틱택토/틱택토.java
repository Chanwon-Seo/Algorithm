import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		StringBuilder sb = new StringBuilder();
		while (!(input = br.readLine()).equals("end")) {
			int xCnt = 0;
			int oCnt = 0;
			map = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					map[i][j] = input.charAt(3 * i + j);

					if (map[i][j] == 'X') {
						xCnt++;
					} else if (map[i][j] == 'O')
						oCnt++;
				}
			}

			if (xCnt == oCnt + 1) {
				if (xCnt + oCnt == 9 && !check('O') || !check('O') && check('X')) {
					sb.append("valid\n");
				} else {
					sb.append("invalid\n");
				}
			} else if (xCnt == oCnt) {
				if (!check('X') && check('O')) {
					sb.append("valid\n");
				} else {
					sb.append("invalid\n");
				}
			} else {
				sb.append("invalid\n");
			}
		}
		System.out.println(sb);
	}

	static boolean check(char c) {
		for (int i = 0; i < 3; i++) {
			if (map[0][i] == c && map[1][i] == c && map[2][i] == c) {
				return true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (map[i][0] == c && map[i][1] == c && map[i][2] == c) {
				return true;
			}
		}

		if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
			return true;
		}

		if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
			return true;
		}

		return false;
	}
}