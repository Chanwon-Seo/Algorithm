package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sb.nextToken());
        int k = Integer.parseInt(sb.nextToken());

        int count = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == k) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}