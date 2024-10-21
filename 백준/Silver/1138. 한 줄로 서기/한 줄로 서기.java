import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int[] tall = new int[N + 1];
        List<Integer> ans = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tall[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N; i >= 1; i--) {
            ans.add(tall[i], i);
        }

        for (Integer num : ans) {
            sb.append(num).append(" ");
        }
        System.out.print(sb);
    }
}