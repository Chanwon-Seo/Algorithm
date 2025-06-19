import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] prices = new Integer[n];
        int totalPrice = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(br.readLine());
            totalPrice += prices[i];
        }

        Arrays.sort(prices, Collections.reverseOrder());

        int discountSum = 0;
        for (int i = 2; i < n; i += 3) discountSum += prices[i];

        System.out.println(totalPrice - discountSum);
    }
}