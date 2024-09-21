package swea;

import java.io.*;
import java.util.*;

public class Solution10505 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] arr = null;

        for (int ti = 1; ti <= T; ti++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new int[N];

            int num = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                num = Integer.parseInt(st.nextToken());
                arr[i] = num;
                sum += num;
            }
            sum /= N;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sum >= arr[i]) {
                    count++;
                }
            }
            sb.append(String.format("#%d %d\n", ti, count));
        }
        
        System.out.println(sb);
    }
}