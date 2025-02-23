import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] lectures = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            lectures[i][0] = Integer.parseInt(st.nextToken());
            lectures[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lectures, (l1, l2) -> {
            if (l1[0] == l2[0]) {
                return l1[1] - l2[1];
            } else {
                return l1[0] - l2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(lectures[0][1]);

        for (int i = 1; i < N; i++) {
            if (!pq.isEmpty() && pq.peek() <= lectures[i][0]) {
                pq.poll();
            }
            pq.offer(lectures[i][1]);
        }

        System.out.println(pq.size());
    }

}