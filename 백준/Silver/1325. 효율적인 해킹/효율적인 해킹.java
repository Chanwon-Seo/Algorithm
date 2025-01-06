import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int max;
    static int[] cntArr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        cntArr = new int[N + 1];

        arr = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
        }

        for (int i = 1; i < N + 1; i++) {
            visited = new boolean[N + 1];
            bfs(i);
        }

        for (int i = 1; i < N + 1; i++) {
            if (max < cntArr[i]) max = cntArr[i];
        }

        for (int i = 1; i < N + 1; i++) {
            if (max == cntArr[i]) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }

    static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i : arr[now]) {
                if (visited[i]) continue;
                cntArr[i]++;
                visited[i] = true;
                q.add(i);
            }
        }
    }

}