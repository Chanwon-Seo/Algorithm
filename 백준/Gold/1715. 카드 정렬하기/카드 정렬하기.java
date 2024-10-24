import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.valueOf(br.readLine()));
        }

        int sum = 0;
        while (pq.size() > 1) {
            int tmp = pq.poll() + pq.poll();
            sum += tmp;
            pq.offer(tmp);
        }
        System.out.println(sum);
    }

}