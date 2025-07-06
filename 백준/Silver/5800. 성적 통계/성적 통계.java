import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[n];

			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr, Collections.reverseOrder());

			int max = arr[0];
			int min = arr[n - 1];
			int gap = Integer.MIN_VALUE;

			for (int j = 0; j < arr.length - 1; j++) {
				gap = Math.max(gap, Math.abs(arr[j] - arr[j + 1]));
			}

			sb.append("Class ").append(i).append('\n');
			sb.append("Max ").append(max).append(", ")
				.append("Min ").append(min).append(", ")
				.append("Largest gap ").append(gap).append('\n');
		}

		System.out.println(sb);
	}
}