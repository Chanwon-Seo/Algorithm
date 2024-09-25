import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, H, days;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int[][][] map;
    static Queue<Tomato> Q = new LinkedList<>();

    static class Tomato {
        int x, y, z;

        public Tomato(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new int[H][N][M];

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                    if (map[k][i][j] == 1) {
                        Q.offer(new Tomato(i, j, k));
                    }
                }
            }
        }
        bfs();
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[k][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, map[k][i][j]);
                }
            }
        }
        if (days == 1) {
            System.out.println(0);
        } else {
            System.out.println(days - 1);
        }
    }

    static void bfs() {
        while (!Q.isEmpty()) {
            Tomato tomato = Q.poll();
            for (int i = 0; i < 6; i++) {
                int nx = dx[i] + tomato.x;
                int ny = dy[i] + tomato.y;
                int nz = dz[i] + tomato.z;
                if (isRoundCheck(nx, ny, nz) && map[nz][nx][ny] == 0) {
                    map[nz][nx][ny] = map[tomato.z][tomato.x][tomato.y] + 1;
                    Q.offer(new Tomato(nx, ny, nz));
                }
            }
        }
    }

    static boolean isRoundCheck(int x, int y, int z) {
        return 0 <= x && x < N && 0 <= y && y < M && 0 <= z && z < H;
    }
}