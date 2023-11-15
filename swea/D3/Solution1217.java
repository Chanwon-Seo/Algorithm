package swea;

import java.io.*;
import java.util.*;

public class Solution {

    static Integer factorial(Integer N, int loopNum) {
        if (loopNum <= 1)
            return N;
        return N * factorial(N, loopNum - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int ti = 1; ti <= 10; ti++) {
            int T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int f = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            sb.append(String.format("#%d %d\n", T, factorial(f, l)));
        }
        System.out.println(sb);

    }
}