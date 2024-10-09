import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long N, Q;

    public static void main(String[] args) throws IOException {
        N = Long.parseLong(br.readLine());
        Q = (long) Math.sqrt(N);

        if (Q * Q < N) {
            Q++;
        }
        System.out.println(Q);
    }
}