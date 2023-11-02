package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int back = -1;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
                back = num;
            } else if (str.equals("pop")) {
                if (!q.isEmpty()) {
                    sb.append(q.poll()).append("\n");
                    if (q.isEmpty()) {
                        back = -1;
                    }
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (str.equals("empty")) {
                if (!q.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (str.equals("front")) {
                if (!q.isEmpty()) {
                    sb.append(q.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else {
                sb.append(back).append("\n");
            }
        }
        System.out.println(sb);
    }
}