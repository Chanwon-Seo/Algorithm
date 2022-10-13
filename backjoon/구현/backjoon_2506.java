package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());
            if (M == 1) {
                result += 1;
            } else {
                result = 0;
            }
            count += result;
        }
        System.out.println(count);
    }
}
