package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> nList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            nList.add(input);
        }

        int[] dp = new int[11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < dp.length; i++) {
            for (int j = 1; j <= 3; j++) {
                dp[i] += dp[i - j];
            }
        }

        for (Integer i : nList) {
            System.out.println(dp[i]);
        }
    }

}
