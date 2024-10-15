import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static BufferedReader dfs = new BufferedReader(new InputStreamReader(System.in));
    static int N, K;
    static String[] arr;
    static boolean[] visited;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(dfs.readLine());
        K = Integer.parseInt(dfs.readLine());

        arr = new String[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = dfs.readLine();
        }
        dfs(0, "");
        System.out.print(set.size());
    }

    static void dfs(int depth, String str) {
        if (depth == K) {
            set.add(str);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, str + arr[i]);
                visited[i] = false;
            }
        }
    }
}