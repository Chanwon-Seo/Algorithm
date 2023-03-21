package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 0};
        int N = Integer.parseInt(br.readLine());

        int a_value = 0;
        for (int i = 0; i < N; i++) {
            a_value = arr[1];
            arr[1] = arr[0] + arr[1];
            arr[0] = a_value;
        }

        System.out.println(arr[0] + " " + arr[1]);
    }
}