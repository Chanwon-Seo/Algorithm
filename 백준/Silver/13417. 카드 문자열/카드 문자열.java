import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            br.readLine();

            LinkedList<Character> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                char ch = st.nextToken().charAt(0);
                if (q.isEmpty()) {
                    q.add(ch);
                } else {
                    if (q.getFirst() >= ch) q.offerFirst(ch);
                    else q.offerLast(ch);

                }
            }

            while (!q.isEmpty()) {
                sb.append(q.poll());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}