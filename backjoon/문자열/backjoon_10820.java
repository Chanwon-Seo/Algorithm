package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = null;
        while ((str = br.readLine()) != null) {
            int[] arr = new int[4];

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    arr[0]++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    arr[1]++;
                } else if (ch >= '0' && ch <= '9') {
                    arr[2]++;
                } else if (ch == ' ') {
                    arr[3]++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.printf(arr[i] + " ");
            }
            System.out.println();
        }
    }
}