package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] ch_arr = br.readLine().toCharArray();

        Arrays.sort(ch_arr);

        for (int i = ch_arr.length - 1; i >= 0; i--) {
            sb.append(ch_arr[i]);
        }
        System.out.println(sb);
    }
}