import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();


        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            map1.put(i, input);
            map2.put(input, i);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (49 <= input.charAt(0) && input.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(map2.get(input)).append("\n");
            }
        }
        System.out.print(sb);
    }

}