import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] dn = {{9, 3, 1}, {9, 1, 3}, {3, 1, 9}, {3, 9, 1}, {1, 3, 9}, {1, 9, 3}};
    static int[][][] visited = new int[61][61][61];
    static int[] scv = new int[3];

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scv[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{scv[0], scv[1], scv[2]});
        visited[scv[0]][scv[1]][scv[2]] = 1;

        while (!q.isEmpty()) {
            int[] scvList = q.poll();
            if (visited[0][0][0] != 0) break;
            for (int i = 0; i < 6; i++) {
                int na = Math.max(scvList[0] - dn[i][0], 0);
                int nb = Math.max(scvList[1] - dn[i][1], 0);
                int nc = Math.max(scvList[2] - dn[i][2], 0);
                if (visited[na][nb][nc] != 0) continue;
                visited[na][nb][nc] = visited[scvList[0]][scvList[1]][scvList[2]] + 1;
                q.offer(new int[]{na, nb, nc});
            }
        }
        return visited[0][0][0] - 1;
    }

}