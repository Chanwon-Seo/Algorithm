package swea;

import java.io.*;
import java.util.*;

public class Solution1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] arr = null;

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            arr = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            sb.append(String.format("#%d ", i + 1));

            for (int j = 0; j < M - 1; j++) {
                sb.append(String.format("%d ", arr[j]));
            }
            sb.append(String.format("%d\n", arr[arr.length - 1]));
        }
        System.out.print(sb);
    }
}