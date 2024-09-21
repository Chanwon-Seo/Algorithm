package swea;

import java.io.*;
import java.util.*;

public class Solution1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int Ti = 0; Ti < T; Ti++) {
            st = new StringTokenizer(br.readLine());

            int firstM = Integer.parseInt(st.nextToken());
            int firstD = Integer.parseInt(st.nextToken());
            int lastM = Integer.parseInt(st.nextToken());
            int lastD = Integer.parseInt(st.nextToken());

            int sum = 1;
            sum += lastD - firstD;

            for (int i = firstM - 1; i < lastM - 1; i++) {
                sum += arr[i];
            }

            sb.append(String.format("#%d %d\n", Ti + 1, sum));
        }

        System.out.println(sb);
    }
}