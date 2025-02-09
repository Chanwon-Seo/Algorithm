import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 0;
        while (t-- > 0) {
            String input = br.readLine();
            if (input.length() % 2 == 1) continue;

            Stack<Character> stack = new Stack<>();
            stack.push(input.charAt(0));
            for (int i = 1; i < input.length(); i++) {
                if (!stack.isEmpty() && stack.peek() == input.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(input.charAt(i));
                }
            }
            if (stack.isEmpty()) count++;
        }
        System.out.println(count);
    }
}
