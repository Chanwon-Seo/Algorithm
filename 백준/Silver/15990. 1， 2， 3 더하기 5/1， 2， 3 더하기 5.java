import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int NUM = 1_000_000_009;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[100_001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;
        for (int i = 4; i <= 100_000; i++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % NUM;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % NUM;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % NUM;
        }

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            sb.append((dp[t][1] + dp[t][2] + dp[t][3]) % NUM + "\n");
        }

        System.out.println(sb);
    }

}