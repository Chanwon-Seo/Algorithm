package backjoon;

import java.io.*;
import java.util.*;

public class boj_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }

        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[arr.length / 2]);
    }
}
