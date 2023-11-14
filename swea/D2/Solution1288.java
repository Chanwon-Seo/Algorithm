package swea;

import java.io.*;
// import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] arr = null;

        for (int Ti = 0; Ti < T; Ti++) {
            arr = new boolean[10];
            // 반복한 횟수
            int ans = 0;
            // 10개가 채워졌는가.
            int count = 10;

            int N = Integer.parseInt(br.readLine());
            int result = 0;
            while (count != 0) {
                ans++;
                result = N * ans;

                String[] str = String.valueOf(result).split("");

                for (int i = 0; i < str.length; i++) {
                    int num = Integer.parseInt(str[i]);
                    if (!arr[num]) {
                        count--;
                        arr[num] = true;
                    }
                }
            }

            sb.append(String.format("#%d %d\n", Ti + 1, result));
        }

        System.out.println(sb);
    }
}