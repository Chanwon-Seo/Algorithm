package swea;

import java.io.*;
import java.util.*;

public class Solution1974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[][] arr = null;

        for (int Ti = 0; Ti < T; Ti++) {
            int flag = 1;
            arr = new int[9][9];

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < 9; i++) {
                int rowSum = 0;
                int colSum = 0;
                for (int j = 0; j < 9; j++) {
                    rowSum += arr[i][j];
                    colSum += arr[j][i];
                }
                if (rowSum != 45 || colSum != 45) {
                    flag = 0;
                    break;
                }
            }

            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int checkNum = 0;
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            checkNum += arr[i + x][j + y];
                        }
                    }
                    if (checkNum != 45) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
            sb.append(String.format("#%d %d\n", Ti + 1, flag));
        }
        System.out.println(sb);
    }
}