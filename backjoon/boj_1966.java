package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Deque<Integer> dq = null;
        StringTokenizer st = null;
        Integer[] arr = null;
        StringBuilder sb = new StringBuilder();
        int N = 0;
        int M = 0;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            dq = new ArrayDeque<>();
            arr = new Integer[N];

            int chk = 0;
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;

                if (j == M) {
                    chk = num;
                    num = 0;
                }

                dq.offer(num);
            }

            Arrays.sort(arr, Collections.reverseOrder());

            int count = 0;

            while (dq.size() > 0) {
                int peekNum = dq.peek();

                if (peekNum == arr[count]) {
                    dq.poll();
                    count++;
                } else if (peekNum == 0 && arr[count] == chk) {
                    count++;
                    sb.append(count).append("\n");
                    break;
                } else {
                    dq.offer(dq.poll());
                }

            }
        }
        System.out.println(sb);

    }
}