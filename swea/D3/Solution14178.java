package swea;

import java.io.*;
import java.util.*;

public class Solution14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            if (N % (D + D + 1) == 0) {
                sb.append(String.format("#%d %d\n", i + 1, N / ((D + D) + 1)));
            } else {
                sb.append(String.format("#%d %d\n", i + 1, (N / ((D + D) + 1)) + 1));
            }
        }
        System.out.println(sb);
    }
}