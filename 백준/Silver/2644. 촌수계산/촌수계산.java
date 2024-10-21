import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, start, end;
    static int result = -1;
    static ArrayList<Integer>[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }

        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x].add(y);
            map[y].add(x);
        }
        dfs(start, 0);
        System.out.println(result);
    }

    static void dfs(int x, int depth) {
        if (x == end) {
            result = depth;
            return;
        }
        visited[x] = true;

        for (int i = 0; i < map[x].size(); i++) {
            if (!visited[map[x].get(i)]) {
                dfs(map[x].get(i), depth + 1);
            }
        }
    }
}