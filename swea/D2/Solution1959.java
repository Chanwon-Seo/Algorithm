package swea;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = null;
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        for (int Ti = 0; Ti < N; Ti++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr = new int[A + B];

            String[] strA = br.readLine().split(" ");
            String[] strB = br.readLine().split(" ");

            if (A < B) {
                for (int i = 0; i < A; i++) {
                    arr[i] = Integer.parseInt(strA[i]);
                }
                for (int i = 0; i < B; i++) {
                    arr[i + A] = Integer.parseInt(strB[i]);
                }
            } else {
                for (int i = 0; i < B; i++) {
                    arr[i] = Integer.parseInt(strB[i]);
                }
                for (int i = 0; i < A; i++) {
                    arr[i + B] = Integer.parseInt(strA[i]);
                }

            }

            int max = Math.max(A, B);
            int min = Math.min(A, B);
            int ans = Integer.MIN_VALUE;

            for (int i = 0; i <= max - min; i++) {
                int result = 0;
                for (int j = 0; j < min; j++) {
                    result += arr[j] * arr[i + j + min];
                }

                if (result > ans) {
                    ans = result;
                }
            }
            sb.append(String.format("#%d %d\n", Ti + 1, ans));

        }
        System.out.println(sb);
    }
}