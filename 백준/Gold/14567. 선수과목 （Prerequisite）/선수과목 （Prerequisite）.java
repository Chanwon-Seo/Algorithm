import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int x;

		public Node(int x) {
			this.x = x;
		}
	}

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();

		List<Node>[] list = new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		int[] arr = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int before = Integer.parseInt(st.nextToken());
			int post = Integer.parseInt(st.nextToken());
			list[post].add(new Node(before));
		}
		arr[1] = 1;
		int max = 0;
		for (int i = 2; i <= n; i++) {
			if (list[i].isEmpty()) {
				arr[i] = 1;
			} else {
				for (Node a : list[i]) {
					if (max <= arr[a.x]) {
						max = arr[a.x] + 1;
					}
				}
				arr[i] = max;
				max = 0;
			}
		}

		for (int i = 1; i <= n; i++) {
			sb.append(arr[i]).append(" ");
		}

		System.out.println(sb);
	}
}