package swea;

import java.io.*;

public class Solution11688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        String str = "";
        for (int ti = 1; ti <= T; ti++) {
            str = br.readLine();
            int a = 1;
            int b = 1;
            int loop = str.length();
            for (int i = 0; i < loop; i++) {
                if (str.charAt(i) == 'L') {
                    b = a + b;
                } else {
                    a = a + b;
                }
            }
            sb.append(String.format("#%d %d %d\n", ti, a, b));
        }
        System.out.println(sb);

    }
}