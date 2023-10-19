import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            String str = br.readLine().trim();
            String reverseStr = "";

            for (int j = str.length() - 1; j >= 0; j--) {
                reverseStr += String.valueOf(str.charAt(j));
            }

            int ans = 0;
            if (reverseStr.equals(str)) {
                ans = 1;
            }
            sb.append(String.format("#%d %d\n", i + 1, ans));
        }
        System.out.println(sb);
    }
}