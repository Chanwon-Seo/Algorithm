package swea;

import java.io.*;
import java.util.*;

public class Solution1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = null;
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        /*
         * 하나의 배열에 1이 3개 일 경우만 검증
         */

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[N + 1][N + 1];

            for (int j = 1; j <= N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int z = 1; z <= N; z++) {
                    int num = Integer.parseInt(st.nextToken());
                    arr[j][z] = num;
                }
            }
            // 행
            int result = 0;
            int count = 0;
            for (int j = 1; j <= N; j++) {
                for (int z = 1; z <= N; z++) {
                    if (arr[j][z] == 1) {
                        count++;
                    } else {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    }
                }
                if (count == K) {
                    result++;
                }
                count = 0;
            }
            // 열

            for (int j = 1; j <= N; j++) {
                for (int z = 1; z <= N; z++) {
                    if (arr[z][j] == 1) {
                        count++;
                    } else {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    }
                }
                if (count == K) {
                    result++;
                }
                count = 0;
            }
            System.out.println(String.format("#%d %d", i + 1, result));
        }
    }
}