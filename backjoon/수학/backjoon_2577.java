package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String str = String.valueOf(a * b * c);


        for (int i = 0; i < str.length(); i++) {

            int chk = str.charAt(i) - '0';
            arr[chk]++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
