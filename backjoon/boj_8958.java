package backjoon;

import java.io.*;

public class boj_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            int max = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    sum += ++max;
                } else {
                    max = 0;
                }
            }
            sb.append(String.format("%d\n", sum));
        }
        System.out.println(sb);
    }
}