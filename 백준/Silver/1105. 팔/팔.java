import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String l = st.nextToken();
        String r = st.nextToken();

        int answer = 0;

        if (l.length() != r.length()) {
            System.out.println(answer);
        } else {
            int i = 0;
            while (i < l.length() && l.charAt(i) == r.charAt(i)) {
                if (l.charAt(i) == '8') {
                    answer++;
                }
                i++;
            }
            System.out.println(answer);
        }
    }
}