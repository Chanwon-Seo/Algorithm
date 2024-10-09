import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static ArrayList<Integer>[] map;
    static int[] visited;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        visited = new int[N + 1];
        map = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a].add(b);
            map[b].add(a);
        }
        bfs();

        for (int i = 2; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb);
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = 1;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (Integer num : map[node]) {

                if (visited[num] != 0) continue;
                visited[num] = node;
                q.offer(num);
            }
        }
    }

}