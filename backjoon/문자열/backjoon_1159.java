package backjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[str.charAt(0) - 97]++;
        }

        StringBuilder sb = new StringBuilder();

        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                check = false;
                System.out.print((char) (i + 97));
            }
        }
        if (check) {
            System.out.println("PREDAJA");
        }
    }
}