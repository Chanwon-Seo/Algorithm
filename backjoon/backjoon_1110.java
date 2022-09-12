package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int left = 0;
        int right = 0;
        int count = 0;
        int sum = n;

        while (true) {
            left = sum / 10;
            right = sum % 10;
            sum = left + right;

            sum = right * 10 + sum % 10;
            count++;
            if (n == sum) {
                break;
            }
        }

        System.out.println(count);
    }
}