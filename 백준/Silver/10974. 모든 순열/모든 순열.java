import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        bfs(0);
        System.out.print(sb);
    }

    static void bfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            arr[depth] = i + 1;
            visited[i] = true;
            bfs(depth + 1);
            visited[i] = false;
        }
    }
}