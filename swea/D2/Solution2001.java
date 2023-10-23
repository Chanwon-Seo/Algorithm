import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        int[][] arr = null;
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    for (int x = 0; x < M; x++) {
                        for (int y = 0; y < M; y++) {
                            sum += arr[i + x][j + y];
                        }
                    }
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                }
            }
            sb.append(String.format("#%d %d\n", Ti + 1, max));
        }
        System.out.println(sb);
    }
}