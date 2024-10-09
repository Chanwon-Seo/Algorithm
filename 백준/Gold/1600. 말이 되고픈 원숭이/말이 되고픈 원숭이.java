import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int K, W, H;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[] hx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] hy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] map;
    static int[][][] visited;


    public static void main(String[] args) throws Exception {
        K = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][W];
        visited = new int[K + 1][H][W];
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        int[] start = new int[]{0, 0, 0};
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int horse = current[0];
            int x = current[1];
            int y = current[2];

            if (x == H - 1 && y == W - 1) {
                return visited[horse][x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (isRoundCheck(nx, ny) && map[nx][ny] == 0 && visited[horse][nx][ny] == 0) {
                    q.offer(new int[]{horse, nx, ny});
                    visited[horse][nx][ny] = visited[horse][x][y] + 1;
                }
            }

            if (horse < K) {
                for (int i = 0; i < 8; i++) {
                    int nx = hx[i] + x;
                    int ny = hy[i] + y;

                    if (isRoundCheck(nx, ny) && map[nx][ny] == 0 && visited[horse + 1][nx][ny] == 0) {
                        visited[horse + 1][nx][ny] = visited[horse][x][y] + 1;
                        q.offer(new int[]{horse + 1, nx, ny});
                    }
                }
            }
        }

        return -1;
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < H && 0 <= y && y < W;
    }
}