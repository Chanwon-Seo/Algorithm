import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) pq.add(Integer.parseInt(br.readLine()));

        for (int i = 0; i < t; i++) {
            if (pq.peek() == 1 || pq.peek() < h) {
                break;
            } else if (pq.peek() >= h) {
                pq.add(pq.poll() / 2);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (pq.peek() < h) {
            sb.append("YES").append("\n").append(count);
        } else {
            sb.append("NO").append("\n").append(pq.peek());
        }
        System.out.print(sb);
    }
}