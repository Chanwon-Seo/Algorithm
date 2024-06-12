package backjoon;

import java.io.*;

public class boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 97]++;
        }
        int max = Integer.MIN_VALUE;

        int checkI = 0;
        String ans = "?";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                checkI = i;
                ans = "no";
            } else if (arr[i] == max) {
                ans = "?";
            }

        }

        if (ans.equals("?")) {
            System.out.println("?");
        } else {
            System.out.println(String.valueOf((char) (checkI + 97)).toUpperCase());
        }

    }
}