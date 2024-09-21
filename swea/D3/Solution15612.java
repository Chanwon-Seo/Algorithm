package swea;

import java.io.*;

public class Solution15612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            char[][] arr = new char[8][8];
            for (int i = 0; i < 8; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            int[] row = new int[8];
            int[] col = new int[8];
            int cnt = 0;
            boolean flag = true;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (arr[i][j] == 'O') {
                        row[i]++;
                        col[j]++;
                        cnt++;
                        if (row[i] >= 2 || col[j] >= 2) {
                            flag = false;
                        }
                    }
                }
            }

            if (cnt == 8 && flag) {
                sb.append(String.format("#%d %s\n", Ti + 1, "yes"));
            } else {
                sb.append(String.format("#%d %s\n", Ti + 1, "no"));
            }
        }
        System.out.println(sb);
    }
}