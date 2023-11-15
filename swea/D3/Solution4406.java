package swea;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] arr = { "a", "e", "i", "o", "u" };

        for (int ti = 1; ti <= T; ti++) {
            String str = br.readLine();
            for (int i = 0; i < 5; i++) {
                if (str.contains(arr[i])) {
                    str = str.replaceAll(arr[i], "");
                }
            }
            sb.append(String.format("#%d %s\n", ti, str));
        }
        System.out.println(sb);
    }
}