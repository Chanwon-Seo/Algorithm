package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        while (N != 0) {
            sum += str.charAt(N - 1)-48;
            N--;
        }
        System.out.println(sum);

    }
}