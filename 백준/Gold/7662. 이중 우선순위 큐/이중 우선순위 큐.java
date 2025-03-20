import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> minPQ = new PriorityQueue<>();
            PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());

            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String ch = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if ("I".equals(ch)) {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                    minPQ.add(n);
                    maxPQ.add(n);
                } else {
                    if (map.isEmpty()) continue;
                    PriorityQueue<Integer> pq = n == 1 ? maxPQ : minPQ;
                    removeMap(pq, map);
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY").append("\n");
            } else {
                int n = removeMap(maxPQ, map);
                sb.append(n).append(" ").append(!map.isEmpty() ? removeMap(minPQ, map) : n)
                        .append("\n");
            }
        }
        System.out.println(sb);
    }

    static int removeMap(PriorityQueue<Integer> que, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = que.poll();
            int cnt = map.getOrDefault(num, 0);

            if (cnt == 0)
                continue;

            if (cnt == 1)
                map.remove(num);
            else
                map.put(num, cnt - 1);

            break;
        }

        return num;
    }
}