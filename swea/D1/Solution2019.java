package swea;

import java.io.*;

public class Solution2019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int sum = 1;

        for (int i = 0; i <= N; i++) {
            sb.append(sum).append(" ");
            sum *= 2;
        }
        System.out.println(sb);
    }
}