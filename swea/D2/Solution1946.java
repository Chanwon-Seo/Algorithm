package swea;

import java.io.*;
import java.util.*;

public class Solution1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(String.format("#%d\n", Ti + 1));

            int count = 0;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int k = Integer.parseInt(st.nextToken());

                while (k-- > 0) {
                    if (count == 10) {
                        sb.append("\n");
                        count = 0;
                    }
                    sb.append(c);
                    ++count;
                }
            }
            sb.append("\n");
            if (Ti == T) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}