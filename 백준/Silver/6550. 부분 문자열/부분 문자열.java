import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String S, T;

    public static void main(String[] args) throws IOException {

        String input = "";
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            S = st.nextToken();
            T = st.nextToken();

            int cnt = 0;

            for (int i = 0; i < T.length(); i++) {
                if (S.charAt(cnt) == T.charAt(i)) {
                    cnt++;
                }
                if (cnt == S.length()) {
                    break;
                }
            }

            if (cnt == S.length()) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}