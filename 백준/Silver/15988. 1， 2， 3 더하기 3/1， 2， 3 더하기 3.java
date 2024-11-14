import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int[] list;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        list = new int[T];
        for (int i = 0; i < T; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        dp = new long[1_000_001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= 1_000_000; i++) {
            for (int j = 1; j <= 3; j++) {
                dp[i] += dp[i - j];
            }
            dp[i] %= 1_000_000_009;
        }
        for (int i = 0; i < T; i++) {
            sb.append(dp[list[i]]).append("\n");
        }
        System.out.print(sb);
    }

}
