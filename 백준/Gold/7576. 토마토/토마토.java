import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M, days;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Tomato> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    Q.offer(new Tomato(i, j));
                }
            }
        }

        bfs();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                days = Math.max(days, map[i][j]);
            }
        }
        if (days == 1) {
            System.out.println(0);
        } else {
            System.out.println(days - 1);
        }
    }

    static class Tomato {
        int x, y;

        Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs() {
        while (!Q.isEmpty()) {
            Tomato t = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + t.x;
                int ny = dy[i] + t.y;

                if (isRoundCheck(nx, ny) && map[nx][ny] == 0) {
                    map[nx][ny] = map[t.x][t.y] + 1;
                    Q.offer(new Tomato(nx, ny));
                }
            }
        }

    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}