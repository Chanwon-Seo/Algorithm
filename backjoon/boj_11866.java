package backjoon;

import java.io.*;
import java.util.*;

public class boj_11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }
        while (N-- > 1) {
            for (int i = 1; i < K; i++) {
                if (!dq.isEmpty()) {
                    dq.addLast(dq.pollFirst());
                }
            }
            sb.append(dq.pollFirst()).append(", ");
        }
        sb.append(dq.pollFirst()).append(">");
        System.out.println(sb);
    }
}