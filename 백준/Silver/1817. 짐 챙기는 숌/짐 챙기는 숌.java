import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, cnt;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (N > 0) {
            stack = new Stack<>();
            cnt = 1;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                stack.add(Integer.parseInt(st.nextToken()));
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += stack.peek();

            if (sum > M) {
                cnt++;
                sum = stack.pop();
            } else {
                stack.pop();
            }
        }
        System.out.println(cnt);
    }
}