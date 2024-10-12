import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int ans = 0;
        int num = N;
        while (true) {
            int sum = (num / 10) + (num % 10);
            num = (num % 10) * 10 + sum % 10;
            ans++;
            if (num == N) {
                break;
            }
        }

        System.out.print(ans);
    }
}