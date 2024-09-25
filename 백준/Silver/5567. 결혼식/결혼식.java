import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] user;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        visited = new boolean[N + 1];
        user = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            user[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            user[from].add(to);
            user[to].add(from);
        }

        visited[1] = true;
        dfs(1, 0);
        int cnt = 0;
        for (int i = 2; i < visited.length; i++) {
            if (visited[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int start, int depth) {
        if (depth == 2) {
            return;
        }
        for (int i = 0; i < user[start].size(); i++) {
            Integer nextUser = user[start].get(i);
            visited[nextUser] = true;
            dfs(nextUser, depth + 1);
        }

    }
}