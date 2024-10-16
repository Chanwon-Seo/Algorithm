import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static StringBuilder output = new StringBuilder();
    static int N, R;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        R = Integer.parseInt(br.readLine());
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            for (int j = 0; j < S; j++) {
                Integer efficacy = map.get(Integer.parseInt(st.nextToken()));
                if (efficacy != null) {
                    sb.append(efficacy).append(" ");
                } else {
                    sb.setLength(0);
                    sb.append("YOU DIED");
                    break;
                }
            }
            output.append(sb.toString()).append("\n");
            sb.setLength(0);
        }
        System.out.print(output);
    }
}