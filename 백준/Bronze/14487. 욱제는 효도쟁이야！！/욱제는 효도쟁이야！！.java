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
        int sum = 0;
        int max = -1;
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            sum += input;
            max = Math.max(max, input);
        }

        System.out.println(sum - max);
    }
}