import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> students = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students.put(st.nextToken(), 0);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String input = st.nextToken();
                students.put(input, students.get(input) + 1);
            }
        }

        ArrayList<String> keyList = new ArrayList<>(students.keySet());

        keyList.sort((k1, k2) -> {
            if (students.get(k1) - students.get(k2) == 0) {
                return k1.compareTo(k2);
            }
            return students.get(k2) - students.get(k1);
        });

        keyList.forEach(k -> sb.append(k + " " + students.get(k)).append("\n"));

        System.out.print(sb);
    }

}
