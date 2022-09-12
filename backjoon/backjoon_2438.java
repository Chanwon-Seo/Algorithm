package backjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {

                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}