import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int N;
    static String yes = "YES", no = "NO";
    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    push(str.charAt(j));
                } else {
                    if (!pop()) {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag || !stack.isEmpty()) {
                sb.append(no).append("\n");
            } else {
                sb.append(yes).append("\n");
            }
        }
        System.out.print(sb);
    }

    static void push(char c) {
        stack.push(c);
    }

    static boolean pop() {
        if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
            return true;
        }
        return false;
    }
}