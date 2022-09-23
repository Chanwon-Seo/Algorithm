package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int R = 0;
        String S = null;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {
                for (int z = 0; z < R; z++) {
                    char ch = S.charAt(j);
                    sb.append(ch);
                }

            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
