import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = 1;
        String input = "";
        while (!(input = br.readLine()).contains("-")) {
            char[] arr = input.toCharArray();
            int count = 0;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];
                if (c == '{') {
                    stack.add(c);
                } else {
                    if (stack.isEmpty()) {
                        count++;
                        stack.add('{');
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) {
                count += stack.size() / 2;
            }
            sb.append(T).append(". ").append(count).append("\n");
            T++;
        }
        System.out.println(sb);
    }
}