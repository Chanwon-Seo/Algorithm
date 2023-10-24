import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int[][] arr = null;
        String[][] ans_arr = null;

        String value = "";

        for (int Ti = 0; Ti < T; Ti++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            ans_arr = new String[N][3];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer((br.readLine()));

                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 90도
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    value += arr[j][i];
                }

                value += " ";
            }
            // 180도
            for (int i = N - 1; i >= 0; i--) {
                for (int j = N - 1; j >= 0; j--) {
                    value += arr[i][j];
                }
                value += " ";
            }

            // 270도
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < N; j++) {
                    value += arr[j][i];
                }
                value += " ";
            }

            String[] str_arr = value.split(" ");

            int flag = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < N; j++) {
                    if (flag == str_arr.length) {
                        continue;
                    }
                    ans_arr[j][i] = str_arr[flag];
                    flag++;

                }

            }

            sb.append(String.format("#%d\n", Ti + 1));

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    sb.append(String.format("%s ", ans_arr[i][j]));
                }
                sb.append("\n");
            }
            value = "";
        }
        System.out.print(sb);
    }
}