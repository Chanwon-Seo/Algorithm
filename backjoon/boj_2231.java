package backjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int min = N;
        int sum = 0;

        String str = "";

        for (int i = 0; i < N; i++) {
            sum = i;

            str = String.valueOf(sum);

            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - 48;
            }
            if (sum == N && min > i) {
                min = i;
            }
            sum = 0;
            str = "";
        }
        if (min == N) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}
