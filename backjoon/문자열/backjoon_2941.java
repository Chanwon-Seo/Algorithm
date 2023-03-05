package backjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();

        for (int i = 0; i < str_arr.length; i++) {
            if (str.contains(str_arr[i])) {
                str = str.replace(str_arr[i], "!");
            }
        }
        System.out.println(str.length());
    }
}