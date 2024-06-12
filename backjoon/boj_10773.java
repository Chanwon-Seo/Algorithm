package backjoon;

import java.io.*;
import java.util.*;

public class boj_10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (stack.size() != 0) {
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (stack.size() != 0) {
                sum += stack.pop();
            }

        }

        System.out.println(sum);
    }
}