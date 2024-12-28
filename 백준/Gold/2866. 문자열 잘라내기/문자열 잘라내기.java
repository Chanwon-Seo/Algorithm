import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                if (i == 0) arr[j] = String.valueOf(input.charAt(j));
                else arr[j] += String.valueOf(input.charAt(j));
            }
        }
        if (n == 2) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < m; j++) {
                String key = arr[j].substring(i);
                if (set.contains(key)) {
                    System.out.println(i - 1);
                    return;
                } else {
                    set.add(key);
                }
            }
        }
        System.out.println(n - 1);
    }
}