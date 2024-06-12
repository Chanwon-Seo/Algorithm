package backjoon;

import java.io.*;
import java.util.*;

public class boj_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {

            int start = 0;
            int mid = 0;
            int end = arr.length - 1;
            int target = Integer.parseInt(st.nextToken());
            boolean flag = false;
            while (start <= end) {

                mid = (start + end) / 2;
                if (arr[mid] == target) {
                    flag = true;
                    break;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                flag = false;
            }

            if (flag) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }

}