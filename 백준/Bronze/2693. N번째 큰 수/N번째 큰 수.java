import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q;
        for (int i = 0; i < N; i++) {
            q = new PriorityQueue<>(Comparator.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
            for (int j = 0; j < 2; j++) {
                q.poll();
            }
            sb.append(q.poll()).append("\n");
        }
        System.out.print(sb);
    }
}