package swea;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int Ti = 1; Ti <= T; Ti++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            if (L <= X && U >= X) {
                sb.append(String.format("#%d %d\n", Ti, 0));
            } else if (L > X) {
                sb.append(String.format("#%d %d\n", Ti, L - X));
            } else {
                sb.append(String.format("#%d %d\n", Ti, -1));
            }
        }
        System.out.println(sb);
    }
}