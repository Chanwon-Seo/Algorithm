import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] power = new int[n];
		String[] title = new String[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			title[i] = st.nextToken();
			power[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(br.readLine());
			int left = 0;
			int right = n;
			int index = 0;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (key <= power[mid]) {
					right = mid - 1;
					index = mid;
				} else if (key > power[mid]) {
					left = mid + 1;
				}
			}
			sb.append(title[index]).append("\n");
		}
		System.out.println(sb);
	}
}
