import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n + 2];

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		arr[n + 1] = l;
		Arrays.sort(arr);

		int left = 1;
		int right = l - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int sum = 0;

			for (int i = 1; i < arr.length; i++) {
				sum += (arr[i] - arr[i - 1] - 1) / mid;
			}

			if (sum > m) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(left);
	}
}