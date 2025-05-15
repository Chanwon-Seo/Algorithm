import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static class Cost implements Comparable<Cost> {
        int idx, cost;

        Cost(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Cost o) {
            return this.cost - o.cost;
        }
    }

    static List<List<Integer>> map = new ArrayList<>();
    static boolean[] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Cost[] costs = new Cost[N];
        visited = new boolean[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i <= N; i++) map.add(new ArrayList<>());

        for (int i = 0; i < N; i++) costs[i] = new Cost(i + 1, Integer.parseInt(st.nextToken()));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if (v == w) {
                continue;
            }

            map.get(v).add(w);
            map.get(w).add(v);
        }

        Arrays.sort(costs);

        boolean flag = false;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int idx = costs[i].idx;
            int cost = costs[i].cost;

            if (visited[idx]) {
                continue;
            }

            if (cost > k) {
                break;
            }

            result += cost;
            k -= cost;

            bfs(idx);

            if (isFriends()) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(result);
        } else {
            System.out.println("Oh no");
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int nxt : map.get(cur)) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    q.offer(nxt);
                }
            }
        }
    }

    static boolean isFriends() {
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

}