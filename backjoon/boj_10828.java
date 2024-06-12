package backjoon;

import java.io.*;
import java.util.*;

public class boj_10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (!stack.empty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append(String.format("%d\n", -1));
                }
            } else if (str.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (str.equals("empty")) {
                if (!stack.empty()) {
                    sb.append(0).append("\n");
                    ;
                } else {
                    sb.append(1).append("\n");
                }
            } else {
                if (!stack.empty()) {
                    sb.append(stack.peek()).append("\n");

                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}