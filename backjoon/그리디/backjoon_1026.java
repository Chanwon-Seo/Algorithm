package backjoon;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Integer[] arrA = new Integer[N];
        Integer[] arrB = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA, Collections.reverseOrder());
        Arrays.sort(arrB);

        int max = 0;
        for (int i = 0; i < N; i++) {
            max += arrA[i] * arrB[i];
        }

        System.out.println(max);
    }
}