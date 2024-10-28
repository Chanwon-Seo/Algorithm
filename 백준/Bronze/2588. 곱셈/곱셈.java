import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static String M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = br.readLine();
        sb.append(N * (M.charAt(2) - '0')).append("\n")
                .append(N * (M.charAt(1) - '0')).append("\n")
                .append(N * (M.charAt(0) - '0')).append("\n")
                .append(N * Integer.parseInt(M));
        System.out.print(sb);
    }
}