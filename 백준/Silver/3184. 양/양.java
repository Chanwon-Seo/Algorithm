import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int R, C, ansS, ansW;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            for (int j = 0; j < C; j++) {
                char ch = input.charAt(j);
                map[i][j] = ch;
                if (ch == '#') visited[i][j] = true;
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                }
            }
        }
        sb.append(ansS).append(" ").append(ansW);
        br.close();
        bw.write(sb.toString());
        bw.close();
    }

    static void bfs(int x, int y) {
        int s = 0;
        int w = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        if (map[x][y] == 'o') s++;
        else if (map[x][y] == 'v') w++;

        while (!q.isEmpty()) {
            int[] v = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + v[0];
                int ny = dy[i] + v[1];
                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 'o') {
                    s++;
                } else if (map[nx][ny] == 'v') {
                    w++;
                }
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
        if (s <= w) ansW += w;
        if (s > w) ansS += s;
    }

}
