import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int X, N;

    public static void main(String[] args) throws IOException {
        X = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        int totalPrice = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            totalPrice += a * b;
        }
        System.out.print(totalPrice == X ? "Yes" : "No");
    }

}