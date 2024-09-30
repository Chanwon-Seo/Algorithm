import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front":
                    dq.offerFirst(Integer.valueOf(st.nextToken()));
                    break;
                case "push_back":
                    dq.offerLast(Integer.valueOf(st.nextToken()));
                    break;
                case "pop_front":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "pop_back":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    if (dq.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

}
