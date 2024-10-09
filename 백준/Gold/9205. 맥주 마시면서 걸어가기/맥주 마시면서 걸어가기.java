import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int T, N, SX, SY, FX, FY;
    static boolean[] visited;
    static List<int[]> store;

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N];

            st = new StringTokenizer(br.readLine());
            SX = Integer.parseInt(st.nextToken());
            SY = Integer.parseInt(st.nextToken());

            store = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                store.add(new int[]{x, y});
            }
            st = new StringTokenizer(br.readLine());
            FX = Integer.parseInt(st.nextToken());
            FY = Integer.parseInt(st.nextToken());

            sb.append(bfs() ? "happy" : "sad").append("\n");
        }
        System.out.print(sb);
    }

    static boolean bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{SX, SY});

        while (!q.isEmpty()) {
            int[] s = q.poll();
            int nx = s[0];
            int ny = s[1];

            long festival = Math.abs(FX - nx) + Math.abs(FY - ny);

            if (festival <= 1000) {
                return true;
            }

            for (int i = 0; i < store.size(); i++) {
                int[] ns = store.get(i);
                int store = Math.abs(ns[0] - nx) + Math.abs(ns[1] - ny);

                if (!visited[i] && store <= 1000) {
                    q.offer(new int[]{ns[0], ns[1]});
                    visited[i] = true;
                }
            }
        }
        return false;
    }

}