package backjoon;

import java.io.*;

public class boj_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(String.format("%d * %d = %d\n", T, i, T * i));
        }

        System.out.println(sb);

    }
}