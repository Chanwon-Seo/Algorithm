import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    stack.push(st.nextToken());
                    break;
                case "2":
                    if (!stack.isEmpty()) sb.append(stack.pop());
                    else sb.append("-1");
                    sb.append("\n");
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (!stack.isEmpty()) sb.append("0");
                    else sb.append("1");
                    sb.append("\n");
                    break;
                case "5":
                    if (!stack.isEmpty()) sb.append(stack.peek());
                    else sb.append("-1");
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}