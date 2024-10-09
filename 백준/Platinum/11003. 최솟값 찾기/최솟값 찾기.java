import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, L;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        Deque<int[]> q = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            while (!q.isEmpty() && q.peekLast()[0] > input) {
                q.removeLast();
            }
            q.offerLast(new int[]{input, i});
            while (!q.isEmpty() && q.peekFirst()[1] < i - L + 1) {
                q.removeFirst();
            }
            sb.append(q.peekFirst()[0]).append(" ");
        }
        System.out.print(sb);
    }
}