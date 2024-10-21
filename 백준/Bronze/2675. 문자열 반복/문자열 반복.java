import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String input = st.nextToken();

            for (int j = 0; j < input.length(); j++) {
                for (int k = 0; k < num; k++) {
                    sb.append(input.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}