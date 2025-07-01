import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fruits = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			fruits[i] = Integer.parseInt(st.nextToken());
		}

		int maxLength = 0;
		int left = 0;
		HashMap<Integer, Integer> fruitsMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			fruitsMap.put(fruits[i], fruitsMap.getOrDefault(fruits[i], 0) + 1);

			while (fruitsMap.size() > 2) {
				fruitsMap.put(fruits[left], fruitsMap.get(fruits[left]) - 1);

				if (fruitsMap.get(fruits[left]) == 0) {
					fruitsMap.remove(fruits[left]);
				}

				left++;
			}
			maxLength = Math.max(maxLength, i - left + 1);
		}
		System.out.println(maxLength);
	}
}