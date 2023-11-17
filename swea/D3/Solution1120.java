package swea;

import java.io.*;
import java.util.*;

public class Solution {
    static int T;
    static int[][] arr;

    static int solution() {
        int count = 0;

        for (int i = 0; i < T; i++) {
            boolean flag = false;
            for (int j = 0; j < T; j++) {
                if (arr[j][i] == 1) {
                    flag = true;
                } else if (arr[j][i] == 2 && flag) {
                    flag = false;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            T = Integer.parseInt(br.readLine());
            arr = new int[T][T];
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < T; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(String.format("#%d %d\n", tc, solution()));
        }
        System.out.println(sb);
    }
}