package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = arr[0];
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        /**
         * version 1
         */
/*
        for (int i = 0; i < arr.length; i++) {
            if (max < min) {
                max = arr[i];
            } else {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
*/
        Arrays.sort(arr); // 배열 정렬
        
        System.out.println(arr[0]); // 정렬된 배열의 첫 번째 작은 수
        System.out.println(arr[arr.length - 1]); // 정렬된 배열의 마지막 큰 수

    }
}
