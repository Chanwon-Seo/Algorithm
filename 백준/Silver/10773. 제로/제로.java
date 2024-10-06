import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0 && !stack.isEmpty()) {
                stack.pop();

            } else {
                stack.push(input);
            }
        }

        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }

}
