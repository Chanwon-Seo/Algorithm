import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && h >= stack.peek()) {
                stack.pop();
            }
            stack.push(h);
        }
        System.out.println(stack.size());
    }
}