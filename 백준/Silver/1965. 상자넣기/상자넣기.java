import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        int[] dp = new int[n];
        st = new StringTokenizer(br.readLine());

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (input[i] > input[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.print(answer);
    }
}