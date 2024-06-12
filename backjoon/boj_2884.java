package backjoon;

import java.io.*;
import java.util.*;

public class boj_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            M = M + 60 - 45;
            if (T == 0) {
                T = 23;
            } else {
                T--;
            }
        } else {
            M -= 45;
        }

        System.out.println(T + " " + M);
    }
}