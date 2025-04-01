import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        String input;
        int count = 0;
        while ((input = br.readLine()) != null) {
            map.put(input, map.getOrDefault(input, 0) + 1);
            count++;
        }

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String value : list) {
            int ans = map.get(value) * 100;
            sb.append(value).append(" ");
            sb.append(String.format("%.4f", (double) ans / (double) count));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}