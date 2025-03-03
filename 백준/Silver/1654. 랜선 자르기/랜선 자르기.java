import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static long left = 1, right = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }

        search();
        System.out.println(right);
    }

    static void search() {
        while (left <= right) {
            long mid = (left + right) / 2;
            long len = 0;

            for (int j : arr) {
                len += (j / mid);
            }

            if (len >= N) {
                left = mid + 1;
            } else if (len < N) {
                right = mid - 1;
            }
        }
    }
}