import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (checkStr(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean checkStr(String str) {
        boolean[] check = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            if (prev != now) {
                if (!check[now - 97]) {
                    check[now - 97] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
