import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Deque<String> q = new LinkedList<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    q.offerFirst(st.nextToken());
                    break;
                case "2":
                    q.offer(st.nextToken());
                    break;
                case "3":
                    if (!q.isEmpty()) sb.append(q.poll());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "4":
                    if (!q.isEmpty()) sb.append(q.pollLast());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "5":
                    sb.append(q.size()).append("\n");
                    break;
                case "6":
                    if (!q.isEmpty()) sb.append(0);
                    else sb.append(1);
                    sb.append("\n");
                    break;
                case "7":
                    if (!q.isEmpty()) sb.append(q.peek());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "8":
                    if (!q.isEmpty()) sb.append(q.peekLast());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
