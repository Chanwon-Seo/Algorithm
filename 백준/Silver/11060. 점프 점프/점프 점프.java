import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());
        map = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0] = true;

        while (!q.isEmpty()) {
            int[] j = q.poll();

            if (j[0] == N - 1) {
                return j[1];
            }

            for (int i = 1; i <= map[j[0]]; i++) {
                int nx = j[0] + i;
                if (nx >= N || visited[nx]) continue;
                q.offer(new int[]{nx, j[1] + 1});
                visited[nx] = true;
            }

        }
        return -1;
    }

}