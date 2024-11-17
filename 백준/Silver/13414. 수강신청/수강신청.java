import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(st.nextToken());
        int student = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < student; i++) {
            String input = br.readLine();
            set.remove(input);
            set.add(input);
        }

        for (String s : set) {
            if (limit > 0) {
                sb.append(s).append("\n");
                limit--;
            }
        }
        System.out.print(sb);
    }
}