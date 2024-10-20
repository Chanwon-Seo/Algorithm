import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int next = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == next) {
                cnt++;
                next = (next + 1) % 3;
            }
        }
        System.out.println(cnt);
    }
}