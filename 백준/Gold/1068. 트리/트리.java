import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, ans;
    static int deleteNode;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }

        int rootNode = -1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input == -1) {
                rootNode = i;
            } else {
                arr[i].add(input);
                arr[input].add(i);
            }
        }
        deleteNode = Integer.parseInt(br.readLine());
        if (deleteNode != rootNode) {
            dfs(rootNode);
        }

        System.out.println(ans);
    }

    static void dfs(int v) {
        visited[v] = true;
        int nodeNum = 0;

        for (int num : arr[v]) {
            if (num != deleteNode && !visited[num]) {
                nodeNum++;
                dfs(num);
            }
        }
        if (nodeNum == 0) {
            ans++;
        }
    }
}