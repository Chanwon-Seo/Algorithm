import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] line = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		line[0] = arr[0];
		int length = 1;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			if (line[length - 1] < key) {
				length++;
				line[length - 1] = key;
			} else {
				int lo = 0;
				int hi = length;
				while (lo < hi) {
					int mid = (lo + hi) >>> 1;
					if (line[mid] < key) {
						lo = mid + 1;
					} else {
						hi = mid;
					}

				}
				line[lo] = key;

			}

		}
		System.out.println(length);
	}
}