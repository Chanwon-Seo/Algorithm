import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String firstInput = br.readLine();
        String lastInput = br.readLine();

        int[][] dp = new int[firstInput.length() + 1][lastInput.length() + 1];

        for (int i = 1; i <= firstInput.length(); i++) {
            for (int j = 1; j <= lastInput.length(); j++) {
                if (firstInput.charAt(i - 1) == lastInput.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[firstInput.length()][lastInput.length()]);
    }

}
