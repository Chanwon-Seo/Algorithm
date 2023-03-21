package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[46];
        int[] b = new int[46];

        a[0] = 1;
        for (int i = 1; i < b.length; i++) {
            b[i] = a[i - 1] + b[i - 1];
            a[i] = b[i - 1];
        }
        int K = Integer.parseInt(br.readLine());
        System.out.println(a[K] + " " + b[K]);
    }
}