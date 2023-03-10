package backjoon;

import java.io.*;

public class Main {
    static String[] polyomino = {"AAAA", "BB"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String ans = str.replaceAll("XXXX", polyomino[0]);
        ans = ans.replaceAll("XX", polyomino[1]);

        if (ans.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}