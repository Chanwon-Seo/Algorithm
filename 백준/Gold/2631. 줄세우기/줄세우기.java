
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] map = new int[n];
		for (int row = 0; row < n; row++)
			map[row] = parseInt(br.readLine());

		List<Integer> dp = new ArrayList<>();

		for (int num : map) {
			if (dp.isEmpty() || num > dp.get(dp.size() - 1))
				dp.add(num);
			else {
				int left = 0, right = dp.size() - 1;
				while (left < right) {
					int mid = left + (right - left) / 2;
					if (dp.get(mid) < num)
						left = mid + 1;
					else
						right = mid;
				}
				dp.set(right, num);
			}
		}

		System.out.println(n - dp.size());
	}
}
