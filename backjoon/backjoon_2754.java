package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char a = str.charAt(0);
        double result = 0;

        if (a == 'A') {
            result = 4;
        } else if (a == 'B') {
            result = 3;
        } else if (a == 'C') {
            result = 2;
        } else if (a == 'D') {
            result = 1;
        } else {
            System.out.println(0.0);
            return;
        }

        a = str.charAt(1);
        if (a == '+') {
            result += 0.3;
        } else if (a == '-') {
            result -= 0.3;
        }
        System.out.println(result);
    }
}