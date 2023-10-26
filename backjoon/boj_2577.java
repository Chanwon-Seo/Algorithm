package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mul = 1;

        for (int i = 0; i < 3; i++) {
            mul *= Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];

        String str = String.valueOf(mul);

        for (int i = 0; i < str.length(); i++) {
            int num = (int) (str.charAt(i) - 48);
            arr[num]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}