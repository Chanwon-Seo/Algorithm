package swea;

import java.io.*;

public class Solution1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str = "";

        for (int ti = 1; ti <= T; ti++) {
            str = br.readLine();
            int count = 0;
            char ch = '0';
            for (int i = 0; i < str.length(); i++) {
                if (ch != str.charAt(i)) {
                    ch = str.charAt(i);
                    count++;
                }
            }

            sb.append(String.format("#%d %d\n", ti, count));
        }
        System.out.println(sb);

    }
}