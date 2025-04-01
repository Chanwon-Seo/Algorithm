import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        int firstData = 0;
        while (q.size() > 1) {
            firstData = q.poll();
            if (q.size() < k) break;

            q.offer(firstData);
            for (int i = 0; i < k - 1; i++) q.poll();
        }
        System.out.println(firstData);
    }
}