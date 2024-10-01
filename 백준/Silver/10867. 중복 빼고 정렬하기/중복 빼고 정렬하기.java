import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[2_001];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            check[Integer.parseInt(st.nextToken()) + 1000] = true;
        }

        for (int i = 0; i < 2001; i++) {
            if (check[i]) {
                sb.append(i - 1000).append(" ");
            }
        }
        System.out.println(sb);
    }
}