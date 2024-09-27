import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = Long.parseLong(br.readLine());

        int N = 1;
        while (S >= N) {
            S -= N;
            N++;
        }
        System.out.println(--N);
    }

}