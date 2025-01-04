import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] pos = new int[1001];
        int tape = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pos[Integer.parseInt(st.nextToken())] = 1;
        }

        for (int i = 1; i <= 1000; i++) {
            if (pos[i] != 0) {
                i += l - 1;
                tape++;
            }
        }
        System.out.println(tape);
    }
}