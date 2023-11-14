package swea;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            String str = br.readLine();

            int loop = str.length();
            int i = 1;
            for (i = 1; i <= loop; i++) {
                if (i != str.charAt(i - 1) - 96) {
                    break;
                }
            }

            sb.append(String.format("#%d %d\n", Ti + 1, i - 1));
        }

        System.out.println(sb);

    }
}