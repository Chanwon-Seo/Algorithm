package swea;

import java.io.*;

public class Solution15941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int ti = 1; ti <= T; ti++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(String.format("#%d %d\n", ti, num * num));
        }
        System.out.println(sb);
    }
}