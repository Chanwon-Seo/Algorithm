import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int count = 0, ans = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
            if (count == K) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
