import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int ti = 0; ti < T; ti++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            dp = new int[n];

            for (int i = 0; i < n; i++) {
                dp[i] = i + 1;
            }
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j < n; j++) {
                    dp[j] += dp[j - 1];
                }
            }
            sb.append(dp[n - 1]).append("\n");
        }
        System.out.print(sb);
    }
}