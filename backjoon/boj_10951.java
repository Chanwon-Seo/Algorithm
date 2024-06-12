package backjoon;

import java.io.*;
import java.util.*;

public class boj_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        String str;

        while ((str = br.readLine()) != null) {

            st = new StringTokenizer(str, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(String.format("%d\n", A + B));
        }

        System.out.println(sb);

    }
}