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

        StringBuilder[] p = new StringBuilder[201];
        for (int i = 0; i < p.length; i++) {
            p[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[age].append(age).append(" ").append(name).append("\n");
        }

        for (StringBuilder value : p) {
            sb.append(value);
        }
        System.out.print(sb);
    }
}