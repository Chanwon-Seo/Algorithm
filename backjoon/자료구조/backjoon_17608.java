package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 1;
        int num = arr[N - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > num) {
                count++;
                num = arr[i];
            }
        }
        System.out.println(count);
    }
}