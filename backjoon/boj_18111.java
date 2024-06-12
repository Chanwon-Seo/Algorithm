package backjoon;

import java.io.*;
import java.util.*;

public class boj_18111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;

                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }

        int time = Integer.MAX_VALUE;
        int blockH = 0;

        for (int i = min; i <= max; i++) {
            int count = 0;
            int inventory = B;

            for (int j = 0; j < N; j++) {
                for (int z = 0; z < M; z++) {
                    if (i < arr[j][z]) {
                        count += (arr[j][z] - i) * 2;
                        inventory += (arr[j][z] - i);
                    } else {
                        count += (i - arr[j][z]);
                        inventory -= (i - arr[j][z]);
                    }
                }
            }

            if (inventory < 0) {
                break;
            }

            if (time >= count) {
                time = count;
                blockH = i;
            }
        }
        System.out.println(String.format("%d %d", time, blockH));
    }
}