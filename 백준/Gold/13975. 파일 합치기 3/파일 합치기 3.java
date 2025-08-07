import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int t = Integer.parseInt(br.readLine());
		for (int ti = 0; ti < t; ti++) {
			PriorityQueue<Long> pq = new PriorityQueue<>();
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				pq.add(Long.parseLong(st.nextToken()));
			}

			Long sum = 0L;
			while (pq.size() > 1) {
				Long a = pq.poll();
				Long b = pq.poll();
				sum += a + b;
				pq.add(a + b);
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}