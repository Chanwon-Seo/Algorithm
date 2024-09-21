package swea;

import java.io.*;
import java.util.*;

public class Solution1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            int priceA = 0;
            int priceB = 0;
            priceA = P * W;

            if (R >= W) {
                priceB = Q;
            } else {
                priceB = Q + ((W - R) * S);
            }

            sb.append(String.format("#%d %d\n", Ti + 1, Math.min(priceA, priceB)));
        }

        System.out.println(sb);

    }
}