import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = new StringBuffer(br.readLine()).reverse().toString();
        StringTokenizer st = new StringTokenizer(input);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    deque.offerFirst(i);
                    break;
                case 2:
                    int temp = deque.pollFirst();
                    deque.offerFirst(i);
                    deque.offerFirst(temp);
                    break;
                case 3:
                    deque.offerLast(i);
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.poll()).append(" ");
        }
        System.out.println(sb);
    }
}
