import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);

		for (int i = 0; i < m; i++) {
			int x = Integer.parseInt(br.readLine());
			sb.append(bs(a, x)).append("\n");
		}

		System.out.println(sb);
	}

	static int bs(int[] arr, int x) {
		int answer = -1;
		int lt = 0, rt = arr.length - 1;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == x) {
				answer = mid;
				rt = mid - 1;
			} else if (arr[mid] < x) {
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}
		return answer;
	}
}
