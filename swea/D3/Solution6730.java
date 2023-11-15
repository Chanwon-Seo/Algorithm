package swea;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        for (int ti = 1; ti <= T; ti++) {
            int num = Integer.parseInt(br.readLine());
            int up = 0;
            int down = 0;
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            for (int i = 0; i < num - 1; i++) {
                int last = Integer.parseInt(st.nextToken());
                if (first > last) {
                    down = Math.max(down, first - last);
                } else {
                    up = Math.max(up, last - first);
                }
                first = last;
            }
            sb.append(String.format("#%d %d %d\n", ti, up, down));
        }
        System.out.println(sb);
    }
}