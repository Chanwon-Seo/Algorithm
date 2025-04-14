import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] op = new int[50];
        op['*'] = op['/'] = 1;
        op['('] = op[')'] = -1;
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A') {
                sb.append(c);
                continue;
            }
            if (c == '(') {
                stack.add(c);
                continue;
            }
            if (c == ')') {
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                continue;
            }
            while (!stack.isEmpty() && op[stack.peek()] >= op[c]) {
                sb.append(stack.pop());
            }
            stack.add(c);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);
    }
}