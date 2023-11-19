package swea;

import java.io.*;
import java.util.*;

public class Solution {
    static StringBuilder sb = new StringBuilder();
    static boolean[] arr;

    static int count;

    static int solution(String num) {
        count = 0;
        arr = new boolean[10];
        int loop = num.length();
        for (int i = 0; i < loop; i++) {
            if (!arr[num.charAt(i) - 48]) {
                count++;
                arr[num.charAt(i) - 48] = true;
            }
        }
        return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String num = br.readLine();
            sb.append(String.format("#%d %d\n", tc, solution(num)));
        }

        System.out.println(sb);
    }

}