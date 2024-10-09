import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long A, B;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        System.out.println(bfs());
    }

    static long bfs() {
        Queue<long[]> q = new LinkedList<>();
        q.offer(new long[]{A, 1});

        while (!q.isEmpty()) {
            long[] num = q.poll();

            if (num[0] == B) {
                return num[1];
            }

            if (num[0] > B) continue;

            q.offer(new long[]{num[0] * 2, num[1] + 1});
            q.offer(new long[]{Long.parseLong(num[0] + "1"), num[1] + 1});
        }
        return -1;
    }

}