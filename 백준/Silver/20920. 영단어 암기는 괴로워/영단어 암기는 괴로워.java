import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.length() >= M) {
                map.put(input, map.getOrDefault(input, 0) + 1);
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int map1 = map.get(o1);
                int map2 = map.get(o2);
                if (map1 != map2) return map2 - map1;
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return o2.length() - o1.length();
            }
        });
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }

}
