package swea;

import java.io.*;
import java.util.*;

public class Solution {
    static Deque<Integer> dq = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    static void solution(int T) {
        while (!dq.isEmpty() && dq.peekLast() != 0 && dq.peekLast() > 0) {
            for (int i = 1; i <= 5; i++) {
                dq.offer(dq.poll() - i);
                if (dq.peekLast() <= 0) {
                    dq.pollLast();
                    dq.offerLast(0);
                    break;
                }
            }
        }
        int size = dq.size() - 1;
        sb.append(String.format("#%d ", T));
        for (int i = 0; i < size; i++) {
            sb.append(String.format("%d ", dq.poll()));
        }
        sb.append(String.format("%d\n", dq.poll()));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        for (int tc = 1; tc <= 10; tc++) {
            int T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 8; i++) {
                dq.offer(Integer.parseInt(st.nextToken()));
            }
            solution(T);
        }
        System.out.println(sb);
    }
}