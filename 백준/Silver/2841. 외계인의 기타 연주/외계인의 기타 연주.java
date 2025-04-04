import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int N, P;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        Stack<Integer>[] stack = new Stack[7];

        for (int i = 0; i <= 6; i++)
            stack[i] = new Stack<>();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            while (!stack[n].isEmpty() && stack[n].peek() > m) {
                stack[n].pop();
                cnt++;
            }

            if (stack[n].empty() || (!stack[n].isEmpty() && stack[n].peek() < m)) {
                stack[n].push(m);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}