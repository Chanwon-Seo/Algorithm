import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 1) {
                String x = st.nextToken();
                String w = st.nextToken();
                map.put(w, x);
            } else {
                String w = st.nextToken();
                sb.append(map.get(w)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
