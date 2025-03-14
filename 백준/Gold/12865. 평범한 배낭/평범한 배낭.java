import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] item = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0] = Integer.parseInt(st.nextToken());
            item[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                dp[j][i] = dp[j - 1][i];
                if (i - item[j][0] >= 0) {
                    dp[j][i] = Math.max(dp[j - 1][i], item[j][1] + dp[j - 1][i - item[j][0]]);
                }
            }
        }


        System.out.println(dp[N][K]);
    }
}