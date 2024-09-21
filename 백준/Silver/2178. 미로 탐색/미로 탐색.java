import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
//                visited[i][j] = true;
            }
        }
        BFS(0, 0);
        System.out.println(map[N - 1][M - 1]);
    }

    static void BFS(int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, j));
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + p.x;
                int ny = dy[k] + p.y;
                if (isRoundCheck(nx, ny)) {
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                    map[nx][ny] = map[p.x][p.y] + 1;
                }
            }
        }
    }

    static boolean isRoundCheck(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= M) {
            return false;
        }
        if (map[x][y] == 0 || visited[x][y]) {
            return false;
        }
        return true;
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}