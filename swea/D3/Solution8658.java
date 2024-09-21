package swea;

import java.io.*;
import java.util.*;

public class Solution8658 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            String[] strArr = br.readLine().split(" ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                int sum = 0;
                String[] str = strArr[i].split("");

                for (int j = 0; j < str.length; j++) {
                    sum += Integer.parseInt(str[j]);
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            sb.append(String.format("#%d %d %d\n", tc, max, min));

        }
        System.out.println(sb);
    }
}