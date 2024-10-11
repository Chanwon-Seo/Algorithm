import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int min = i, sum = 0;

            while (min != 0) {
                sum += min % 10;
                min /= 10;
            }
            if (sum + i == N) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
