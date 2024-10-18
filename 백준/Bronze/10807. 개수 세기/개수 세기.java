import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (st.hasMoreTokens()) {
            if (M == Integer.parseInt(st.nextToken())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}