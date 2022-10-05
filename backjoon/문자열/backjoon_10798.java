package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        char[][] ch_arr = new char[5][15];

        for (int i = 0; i < ch_arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                ch_arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < ch_arr[0].length; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch_arr[j][i] == ' ' || ch_arr[j][i] == '\0') {
                    continue;
                }
                sb.append(ch_arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}