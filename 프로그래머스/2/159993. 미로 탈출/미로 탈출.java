import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][][] visited;
    static int N, M, SX, SY, EX, EY;

    static class Point {
        int x, y, TF, cnt;

        public Point(int x, int y, int TF, int cnt) {
            this.x = x;
            this.y = y;
            this.TF = TF;
            this.cnt = cnt;
        }
    }

    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        visited = new boolean[2][N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') {
                    SX = i;
                    SY = j;
                } else if (map[i][j] == 'E') {
                    EX = i;
                    EY = j;
                }
            }
        }

        return bfs();
    }

    static int bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(SX, SY, 0, 0));
        visited[0][SX][SY] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x == EX && p.y == EY && p.TF == 1) {
                return p.cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                int nextMoveCnt = p.cnt + 1;
                if (isRoundCheck(nx, ny) && map[nx][ny] != 'X' && !visited[p.TF][nx][ny]) {
                    if (map[nx][ny] == 'L') {
                        q.offer(new Point(nx, ny, 1, nextMoveCnt));
                        visited[1][nx][ny] = true;
                    } else {
                        q.offer(new Point(nx, ny, p.TF, nextMoveCnt));
                        visited[p.TF][nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }

    static boolean isRoundCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}