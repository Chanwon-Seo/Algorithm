package backjoon;

import java.io.*;

public class boj_1552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split(" ");

        int ans = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[0].equals("")) {
                continue;
            }
            ans++;
        }
        System.out.println(ans);
    }
}