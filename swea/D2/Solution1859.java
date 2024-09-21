package swea;

import java.io.*;
import java.util.*;

public class Solution1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] arr = null;

        for (int Ti = 0; Ti < T; Ti++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }
            long max = 0;
            long sum = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (max < arr[i]) {
                    max = arr[i];
                } else {
                    sum += max - arr[i];
                }
            }
            sb.append(String.format("#%d %d\n", Ti + 1, sum));
        }

        System.out.println(sb);
    }
}
