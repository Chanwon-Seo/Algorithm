import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> q;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String p = br.readLine();
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            q = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                q.add(Integer.parseInt(st.nextToken()));
            }
            AC(p);
        }
        System.out.print(sb);
    }

    static void AC(String p) {
        boolean isReverse = false;
        for (char c : p.toCharArray()) {
            if (c == 'R') {
                isReverse = !isReverse;
                continue;
            }

            if (q.isEmpty()) {
                sb.append("error").append("\n");
                return;
            }
            if (isReverse) q.removeLast();
            else q.removeFirst();
        }

        sb.append("[");
        while (!q.isEmpty()) {
            sb.append(isReverse ? q.removeLast() : q.removeFirst());
            if (!q.isEmpty()) {
                sb.append(",");
            }
        }
        sb.append("]").append("\n");
    }
}