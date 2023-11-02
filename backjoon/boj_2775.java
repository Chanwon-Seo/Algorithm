package backjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] arr = null;

        for (int Ti = 0; Ti < T; Ti++) {
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            arr = new int[B + 1];

            for (int i = 0; i <= A; i++) {
                for (int j = 0; j < B; j++) {
                    arr[1] = 1;
                    if (i == 0) {
                        arr[j + 1] = j + 1;
                        continue;
                    }
                    arr[j + 1] = arr[j + 1] + arr[j];

                }
            }
            sb.append(String.format("%d\n", arr[B]));
        }
        System.out.println(sb);
    }
}