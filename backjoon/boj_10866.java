package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (str.equals("push_back")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop_front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.pollFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (str.equals("pop_back")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.pollLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(dq.size()).append("\n");
            } else if (str.equals("empty")) {
                if (!dq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (str.equals("front")) {
                if (!dq.isEmpty()) {
                    sb.append(dq.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else {
                if (!dq.isEmpty()) {
                    sb.append(dq.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}