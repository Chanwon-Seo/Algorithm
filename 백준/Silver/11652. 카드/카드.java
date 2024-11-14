import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> cards = new HashMap<>();
        int max = 0;
        long x = 0;

        for (int i = 0; i < N; i++) {
            long cardNum = Long.parseLong(br.readLine());
            cards.put(cardNum, cards.getOrDefault(cardNum, 0) + 1);
            if (cards.get(cardNum) > max) {
                max = cards.get(cardNum);
                x = cardNum;
            } else if (cards.get(cardNum) == max) {
                x = Math.min(x, cardNum);
            }
        }

        System.out.println(x);
    }
}