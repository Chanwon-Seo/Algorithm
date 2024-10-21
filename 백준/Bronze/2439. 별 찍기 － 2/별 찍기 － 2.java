import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}