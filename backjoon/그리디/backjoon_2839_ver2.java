package backjoon;

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                ans += n / 5;
                break;
            } else {
                n -= 3;
                ans++;
            }
            if (ans < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}