import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> dq = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            dq.offer(new int[]{Integer.parseInt(st.nextToken()), i});
        }
        int moveIdx = dq.poll()[0];
        sb.append("1 ");

        while (!dq.isEmpty()) {
            if (moveIdx > 0) {
                for (int i = 1; i < moveIdx; i++) {
                    dq.offer(dq.poll());
                }
                int[] balloon = dq.poll();
                moveIdx = balloon[0];
                sb.append(balloon[1]).append(" ");
            } else {
                for (int i = 1; i < -moveIdx; i++) {
                    dq.addFirst(dq.pollLast());
                }
                int[] balloon = dq.pollLast();
                moveIdx = balloon[0];
                sb.append(balloon[1]).append(" ");
            }
        }
        System.out.print(sb);

    }

}