import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            if (Integer.parseInt(st.nextToken()) == 0) {
                if (!pq.isEmpty()) {
                    sb.append(pq.poll());
                } else {
                    sb.append(-1);
                }
                sb.append("\n");
            } else {
                while (st.hasMoreTokens()) {
                    pq.offer(Integer.valueOf(st.nextToken()));
                }
            }
        }
        System.out.println(sb);

    }
}