package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(tile(N));
    }

    static int tile(int t) {
        if (t == 1) {
            return 1;
        }

        if (t == 2) {
            return 2;
        }
        int num1 = 1;
        int num2 = 2;
        int sum = 0;
        for (int i = 2; i < t; i++) {
            sum = (num1 + num2) % 15746;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }

}
