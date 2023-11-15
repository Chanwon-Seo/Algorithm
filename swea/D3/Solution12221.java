package swea;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int ti = 1; ti <= T; ti++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int result = -1;
            if (0 < f && f < 10 && 0 < l && l < 10) {
                result = f * l;
            }

            sb.append(String.format("#%d %s\n", ti, result));
        }
        System.out.println(sb);
    }
}