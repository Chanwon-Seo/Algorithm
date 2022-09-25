package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] money_type = new int[N];

        for (int i = 0; i < money_type.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            money_type[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int j = N - 1; j >= 0; j--) {
            if (money / money_type[j] == 0) {
                continue;
            } else {
                result += money / money_type[j];
                money = money % money_type[j];
            }
        }
        System.out.println(result);
    }
}