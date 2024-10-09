import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, ans;
    static int[] x;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        x = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        BS();
        System.out.println(ans);
    }

    static void BS() {
        int left = 0, right = N;
        while (left <= right) {
            int mid = (left + right) / 2;

            int point = 0;
            boolean possible = true;

            for (int i = 0; i < M; i++) {
                if (x[i] - mid <= point) {
                    point = x[i] + mid;
                } else {
                    possible = false;
                    break;
                }
            }

            if (possible && N - point <= 0) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
