package backjoon;

import java.io.*;
import java.util.*;

public class boj_1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
            for (int j = 0; j < M; j++) {
                if (value.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }

            }
        }

        int min = 64;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int cnt = 0;
                boolean chk = arr[i][j];

                for (int z = i; z < i + 8; z++) {
                    for (int h = j; h < j + 8; h++) {
                        if (arr[z][h] != chk) {
                            cnt++;
                        }
                        chk = !chk;
                    }
                    chk = !chk;
                }

                cnt = Math.min(cnt, 64 - cnt);

                min = Math.min(min, cnt);
            }
        }
        System.out.println(min);
    }
}