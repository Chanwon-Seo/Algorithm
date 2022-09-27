package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.printf(String.valueOf(str.charAt(i)));
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
