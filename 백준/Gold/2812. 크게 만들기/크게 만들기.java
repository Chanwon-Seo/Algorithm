import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        char[] arr = input.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();

        for (char c : arr) {
            while (k > 0 && !dq.isEmpty() && dq.getLast() < c) {
                dq.removeLast();
                k--;
            }
            dq.addLast(c);
        }

        StringBuilder ans = new StringBuilder();
        while (dq.size() > k) ans.append(dq.removeFirst());

        System.out.println(ans);
    }

}
