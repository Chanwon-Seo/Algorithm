package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] p = new long[n + 2];
        p[0] = 0L;
        p[1] = 1L;
        for (int i = 2; i <= n; i++) {
            p[i] = p[i - 1] + p[i - 2];
        }
        System.out.println(p[n]);
    }
}