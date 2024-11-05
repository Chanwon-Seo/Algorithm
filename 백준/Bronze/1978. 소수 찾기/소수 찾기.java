import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }
            boolean flag = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}