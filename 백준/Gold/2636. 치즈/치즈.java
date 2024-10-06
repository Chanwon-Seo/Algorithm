import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cheeseCnt, totalCheeseCnt, hour;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;

    static class Cheese {
        int x, y;

        public Cheese(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    totalCheeseCnt++;
                }
            }
        }

        while (totalCheeseCnt != 0) {
            cheeseCnt = totalCheeseCnt;
            bfs();
            hour++;
        }
        System.out.println(sb.append(hour).append("\n").append(cheeseCnt));
    }

    static void bfs() {
        Queue<Cheese> q = new LinkedList<>();
        q.offer(new Cheese(0, 0));
        visited = new boolean[N][M];
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Cheese c = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + c.x;
                int ny = dy[i] + c.y;
                if (isRoundCheck(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if (map[nx][ny] == 0) {
                        q.offer(new Cheese(nx, ny));
                    } else {
                        map[nx][ny] = 0;
                        totalCheeseCnt--;
                    }
                }
            }
        }

    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}
