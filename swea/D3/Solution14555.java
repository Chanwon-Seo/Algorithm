package swea;

import java.io.*;

public class Solution14555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            String str = br.readLine();

            int loop = str.length() - 1;
            int result = 0;
            for (int i = 0, j = 2; i < loop; i++, j++) {
                if (str.substring(i, j).equals("()") || str.substring(i, j).equals("|)")
                        || str.substring(i, j).equals("(|")) {
                    result++;
                }
            }
            sb.append(String.format("#%d %d\n", Ti + 1, result));
        }
        System.out.println(sb);
    }
}