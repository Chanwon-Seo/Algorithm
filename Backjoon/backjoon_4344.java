package backjoon;

import java.util.Scanner;

public class backjoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int std = sc.nextInt(); // 학생 수

        for (int i = 0; i < std; i++) {

            int n = sc.nextInt();
            arr = new int[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double mean = (sum / n);
            double count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / n) * 100);
        }
        sc.close();
    }
}
