package backjoon;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            Stack<Integer> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            for (int j = first; j <= last; j++) {
                stack.push(arr[j]);
            }

            for (int j = first; j <= last; j++) {
                arr[j] = stack.pop();
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}