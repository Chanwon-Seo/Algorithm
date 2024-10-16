import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (!set.add(name)) {
                set.remove(name);
            }
        }

        for (int i = 0; i < N - 1; i++) {
            String name = br.readLine();
            if (!set.add(name)) {
                set.remove(name);
            }
        }

        for (String person : set) {
            sb.append(person).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
