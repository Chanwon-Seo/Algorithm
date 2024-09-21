package swea;

import java.io.*;

public class Solution1215 {
    static int T;

    static int check(String s, int first, int last) {
        if (first >= last) {
            return 1;
        } else if (s.charAt(first) != s.charAt(last)) {
            return 0;
        } else {
            return check(s, first + 1, last - 1);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = null;

        for (int ti = 1; ti <= 10; ti++) {
            T = Integer.parseInt(br.readLine());
            arr = new char[8][8];

            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                arr[i] = str.toCharArray();
            }
            int count = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8 - T + 1; j++) {
                    String str = "";
                    for (int z = 0; z < T; z++) {
                        str += arr[i][j + z];
                    }
                    if (check(str, 0, str.length() - 1) == 1) {
                        count++;
                    }
                }
            }
            for (int i = 0; i < 8 - T + 1; i++) {
                for (int j = 0; j < 8; j++) {
                    String str = "";
                    for (int z = 0; z < T; z++) {
                        str += arr[i + z][j];
                    }
                    if (check(str, 0, str.length() - 1) == 1) {
                        count++;
                    }
                }
            }
            sb.append(String.format("#%d %d\n", ti, count));
        }
        System.out.println(sb);
    }
}