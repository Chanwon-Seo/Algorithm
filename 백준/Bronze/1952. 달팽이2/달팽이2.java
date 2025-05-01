import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];

        int sum, index = 0, nowX = 0, nowY = 0, cnt = 0;
        visited[nowX][nowY] = true;
        sum = 1;

        while (index < 4) {
            int nx = nowX + dx[index];
            int ny = nowY + dy[index];

            if (sum == n * m) {
                System.out.println(cnt);
                return;
            }

            if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny]) {
                sum++;
                visited[nx][ny] = true;
                nowX = nx;
                nowY = ny;
            } else {
                index++;
                cnt++;
            }

            if (index >= 4) {
                index = 0;
            }
        }
    }
}