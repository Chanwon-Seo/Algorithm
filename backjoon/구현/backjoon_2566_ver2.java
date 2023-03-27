package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int x = 1;
        int y = 1;


        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < 10; j++) {
                int max = Integer.parseInt(st.nextToken());
                if (max > num) {
                    num = max;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(num + "\n" + x + " " + y);
    }
}