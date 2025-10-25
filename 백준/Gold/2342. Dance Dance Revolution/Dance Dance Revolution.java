import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][][] dp;
	static ArrayList<Integer> list;
	static int size;
	static int[][] width = {
		{1, 2, 2, 2, 2},
		{0, 1, 3, 4, 3},
		{0, 3, 1, 3, 4},
		{0, 4, 3, 1, 3},
		{0, 3, 4, 3, 1}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		list = new ArrayList<>();
		while (true) {
			int n = Integer.parseInt(st.nextToken());
			if (n == 0)
				break;
			list.add(n);
		}
		size = list.size();
		dp = new int[size][5][5];
		int answer = search(0, 0, 0);
		System.out.println(answer);
	}

	static int search(int idx, int l, int r) {
		if (idx == size) {
			return 0;
		}

		if (dp[idx][l][r] != 0) {
			return dp[idx][l][r];
		}

		int nxt = list.get(idx);
		dp[idx][l][r] = Math.min(search(idx + 1, nxt, r) + width[l][nxt], search(idx + 1, l, nxt) + width[r][nxt]);

		return dp[idx][l][r];
	}
}

