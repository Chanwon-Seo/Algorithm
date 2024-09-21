package swea;

import java.io.*;

public class Solution13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int ti = 1; ti <= T; ti++) {
            int N = Integer.parseInt(br.readLine());

            int max = 0;
            if (N >= 3) {
                    max = N / 3;
            }

            sb.append(String.format("#%d %d\n", ti, max));
        }
        System.out.println(sb);
    }
}