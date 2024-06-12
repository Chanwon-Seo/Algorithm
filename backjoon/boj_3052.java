package backjoon;

import java.io.*;

public class boj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }

        int flag = 0;
        int chk = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            int j = 0;
            for (j = 0; j < i; j++) {
                if (num == arr[j]) {
                    chk = 0;
                    break;
                } else {
                    chk = 1;
                }
            }

            if (chk == 1) {
                flag = j;
                arr[flag] = num;
                chk = 0;
                max++;
            }

        }
        System.out.println(max);
    }
}