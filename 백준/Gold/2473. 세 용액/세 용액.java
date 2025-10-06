import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static long[] pick = new long[3];
	static long max = 3_000_000_000L;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Long.parseLong(st.nextToken());

		Arrays.sort(arr);

		for (int i = 0; i < n - 2; i++) {
			search(arr, i);
		}

		Arrays.sort(pick);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			sb.append(pick[i]).append(" ");
		}
		System.out.println(sb);
	}

	static void search(long[] arr, int index) {
		int left = index + 1;
		int right = arr.length - 1;

		while (left < right) {

			long sum = arr[left] + arr[right] + arr[index];
			long absSum = Math.abs(sum);

			if (absSum < max) {
				pick[0] = arr[left];
				pick[1] = arr[right];
				pick[2] = arr[index];
				max = absSum;
			}

			if (sum > 0) {
				right--;
			} else {
				left++;
			}
		}
	}
}