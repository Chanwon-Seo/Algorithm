package backjoon;

import java.io.*;

public class boj_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            sb.append(String.format("%d\n", i));
        }

        System.out.println(sb);

    }
}