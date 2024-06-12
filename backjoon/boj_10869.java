package backjoon;

import java.io.*;
import java.util.*;

public class boj_10869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        sb.append(String.format("%d\n", A + B));
        sb.append(String.format("%d\n", A - B));
        sb.append(String.format("%d\n", A * B));
        sb.append(String.format("%d\n", A / B));
        sb.append(String.format("%d\n", A % B));

        System.out.print(sb);
    }
}
