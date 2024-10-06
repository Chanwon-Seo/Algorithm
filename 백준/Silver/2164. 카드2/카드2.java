import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (N-- > 1) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
