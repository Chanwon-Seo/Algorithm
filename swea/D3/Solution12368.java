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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int time = 0;
            if (A + B >= 24) {
                time = (A + B) - 24;
            } else {
                time = A + B;
            }
            sb.append(String.format("#%d %d\n", ti, time));
        }
        System.out.println(sb);
    }
}