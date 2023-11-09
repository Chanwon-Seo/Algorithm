package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int end = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, arr[i]);
        }

        int start = 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            long sum = 0;
            for (int i = 0; i < N; i++) {
                int num = arr[i] - mid;
                if (num > 0) {
                    sum += num;
                }

            }

            if (sum < M) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        System.out.println(end);
    }
}