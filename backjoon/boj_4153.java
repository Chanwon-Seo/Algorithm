package backjoon;

import java.io.*;
import java.util.*;

public class boj_4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (a * a + c * c == b * b) {
                System.out.println("right");
            } else if (c * c + b * b == a * a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}