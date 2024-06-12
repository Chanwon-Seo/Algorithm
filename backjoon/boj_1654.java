package backjoon;

import java.io.*;
import java.util.StringTokenizer;


public class boj_1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
            max = Math.max(max, arr[i]);
        }

        long start = 1;

        while (start <= max) {

            long mid = (start + max) / 2;
            long count = 0;

            for (long num : arr) {
                count += num / mid;
            }
            if (count < N) {
                max = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(max);
    }
}