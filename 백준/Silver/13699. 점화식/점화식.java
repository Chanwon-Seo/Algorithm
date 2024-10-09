import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        dp = new long[N + 2];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        System.out.println(dp[N]);
    }
}