package backjoon;

import java.io.*;
import java.util.*;

public class boj_1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));

    }
}