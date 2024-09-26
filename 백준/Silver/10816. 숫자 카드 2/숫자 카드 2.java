import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> NCard = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            NCard.put(num, NCard.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        int[] cardList = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (NCard.get(value) != null) {
                cardList[i] = NCard.get(value);
                continue;
            }
            cardList[i] = 0;
        }
        for (int i = 0; i < M; i++) {
            sb.append(cardList[i]).append(" ");
        }
        System.out.println(sb);
    }

}