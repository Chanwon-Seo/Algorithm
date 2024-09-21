package swea;

import java.io.*;

public class Solution13547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            String str = br.readLine();
            int loop = str.length();
            int count = 0;
            for (int i = 0; i < loop; i++) {
                if (str.charAt(i) == 'x') {
                    count++;
                }
            }

            if (loop - count >= 8) {
                sb.append(String.format("#%d %s\n", Ti + 1, "YES"));
            } else if (count < 8 && 15 - count >= 8) {
                sb.append(String.format("#%d %s\n", Ti + 1, "YES"));
            } else {
                sb.append(String.format("#%d %s\n", Ti + 1, "NO"));

            }
        }
        System.out.println(sb);
    }
}