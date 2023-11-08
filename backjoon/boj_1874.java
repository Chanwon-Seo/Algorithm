package backjoon;

import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int i = 0;
        boolean flag = true;
        while (i != N) {

            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                sb.append("-\n");
                i++;

            } else if (!stack.isEmpty() && arr[i] < count) {
                flag = false;
                break;
            } else {
                count++;
                stack.push(count);
                sb.append("+\n");
            }
        }

        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}