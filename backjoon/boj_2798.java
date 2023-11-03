package backjoon;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int z = j + 1; z < N; z++) {
                    int sum = arr[i] + arr[j] + arr[z];

                    if (sum == M) {
                        ans = sum;
                        break;
                    }
                    if (sum < M) {
                        ans = Math.max(sum, ans);
                    }
                }
            }

        }
        System.out.println(ans);
    }
}