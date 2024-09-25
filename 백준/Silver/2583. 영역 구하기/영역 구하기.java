import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K, cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = -1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    bfs(i, j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        cnt = 1;

        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;
                if (isRoundCheck(nx, ny) && map[nx][ny] == 0 && !visited[nx][ny]) {
                    q.offer(new Point(nx, ny));
                    visited[nx][ny] = true;
                    cnt++;
                }
            }
        }
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}