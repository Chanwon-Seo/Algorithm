import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<String> q = new LinkedList<>();
        Stack<Boolean> stack = new Stack<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String flag = st.nextToken();
            if ("1".equals(flag)) {
                q.offer(st.nextToken());
                stack.push(true);
            } else if ("2".equals(flag)) {
                q.offerFirst(st.nextToken());
                stack.push(false);
            } else if (!stack.isEmpty()) {
                if (stack.pop()) q.removeLast();
                else q.removeFirst();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : q) {
            sb.append(s);
        }
        System.out.println(sb.length() > 0 ? sb : "0");
    }
}