import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, ans;
    static int[] num = {1, 5, 10, 50};
    static boolean[][] DP = new boolean[21][1001];

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        cal(0, 0);
        System.out.println(ans);
    }

    static void cal(int cnt, int value) {
        if (cnt == N) {
            if (!DP[cnt][value]) {
                ans++;
                DP[cnt][value] = true;
            }
            return;
        }

        if (DP[cnt][value]) {
            return;
        }
        DP[cnt][value] = true;
        for (int i = 0; i < 4; i++) {
            cal(cnt + 1, value + num[i]);
        }
    }
}