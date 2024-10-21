import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K, ans;
    static int[] dx = {-1, 1, 2};
    static boolean[] visited;

    static class Point {
        int x, moveCnt;

        public Point(int x, int moveCnt) {
            this.x = x;
            this.moveCnt = moveCnt;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100_001];

        bfs();

        System.out.println(ans);
    }

    static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(N, 0));
        visited[N] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x == K) {
                ans = p.moveCnt;
                return;
            }

            for (int i = 0; i < 3; i++) {
                int nx = 0;
                if (i == 2) {
                    nx = dx[i] * p.x;
                } else {
                    nx = dx[i] + p.x;
                }

                if (isRoundCheck(nx) && !visited[nx]) {
                    q.offer(new Point(nx, p.moveCnt + 1));
                    visited[nx] = true;
                }
            }

        }
    }

    static boolean isRoundCheck(int x) {
        return 0 <= x && x < 100_001;
    }
}