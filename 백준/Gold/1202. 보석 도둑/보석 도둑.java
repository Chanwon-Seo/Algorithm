import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class jewel implements Comparable<jewel> {
        int value;
        int weight;

        public jewel(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public int compareTo(jewel o) {
            if (this.weight == o.weight)
                return o.value - this.value;
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        jewel[] jewels = new jewel[n];
        long answer = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            jewels[i] = new jewel(V, M);
        }

        for (int i = 0; i < k; i++) {
            int C = Integer.parseInt(br.readLine());
            arr[i] = C;
        }

        Arrays.sort(arr);
        Arrays.sort(jewels);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0, j = 0; i < k; i++) {
            while (j < n) {
                if (arr[i] < jewels[j].weight) break;
                pq.add(jewels[j++].value);
            }

            if (!pq.isEmpty()) answer += pq.poll();

        }
        System.out.print(answer);
    }
}