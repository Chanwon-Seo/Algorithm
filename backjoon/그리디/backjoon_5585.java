package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int[] coin_type = {500, 100, 50, 10, 5, 1};
        cost = 1000 - cost;
        int result = 0;
        for (int i = 0; i < coin_type.length; i++) {
            if (cost / coin_type[i] > 0) {
                result += cost / coin_type[i];
                cost = cost % coin_type[i];
            }
        }
        System.out.println(result);
    }
}