import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Map<String, Integer> map = new HashMap<>();
    static List<String> list = new ArrayList<>();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String input = st.nextToken();
            if (!map.containsKey(input)) {
                list.add(input);
            }
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        Collections.sort(list);
        for (String s : list) {
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.print(sb);
    }
}