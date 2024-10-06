import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            LinkedList<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int cnt = 0;
            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean flag = true;
                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        q.offer(front);

                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    continue;
                }
                cnt++;
                if (front[0] == M) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

    }

}
