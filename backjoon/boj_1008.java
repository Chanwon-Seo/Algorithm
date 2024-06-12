package backjoon;

import java.io.*;
import java.util.*;

public class boj_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));

    }
}