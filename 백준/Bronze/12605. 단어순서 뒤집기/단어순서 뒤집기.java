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
            String[] split = br.readLine().split(" ");
            sb.append("Case ").append("#").append(i).append(": ");
            for (int j = split.length - 1; j >= 0; j--) {
                sb.append(split[j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}