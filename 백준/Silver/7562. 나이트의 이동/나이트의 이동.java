import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int T, I;
    static int sX, sY, fX, fY; //시작X,시작Y, 종료X, 종료Y
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
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
        T = Integer.parseInt(br.readLine());


        StringTokenizer st;
        for (int Ti = 0; Ti < T; Ti++) {
            I = Integer.parseInt(br.readLine());
            map = new int[I][I];
            visited = new boolean[I][I];

            st = new StringTokenizer(br.readLine());
            sX = Integer.parseInt(st.nextToken());
            sY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            fX = Integer.parseInt(st.nextToken());
            fY = Integer.parseInt(st.nextToken());
            bfs(sX, sY);
            System.out.println(map[fX][fY]);
        }
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Point point = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;
                if (isRoundCheck(nx, ny) && !visited[nx][ny]) {
                    q.offer(new Point(nx, ny));
                    map[nx][ny] = map[point.x][point.y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < I && 0 <= y && y < I;
    }
}