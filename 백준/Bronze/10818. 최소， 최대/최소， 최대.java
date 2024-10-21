import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int max = -1_000_000;
        int min = 1_000_001;
        while (st.hasMoreTokens()) {
            int input = Integer.parseInt(st.nextToken());
            max = Math.max(max, input);
            min = Math.min(min, input);
        }

        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}