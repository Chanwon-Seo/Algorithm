package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26];
            boolean tmp = true;

            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                int num = str.charAt(j) - 'a';
                if (check[num]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    check[num] = true;
                }
            }

            if (tmp) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}