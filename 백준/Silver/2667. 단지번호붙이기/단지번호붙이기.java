import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int cnt, N;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] apt;
    static boolean[][] visited;
    static ArrayList<Integer> result;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        result = new ArrayList<>();
        apt = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                apt[i][j] = input[j] - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apt[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    visited[i][j] = true;
                    DFS(i, j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (Integer count : result) {
            System.out.println(count);
        }

    }

    private static void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRangeCheck(nx, ny) && !visited[nx][ny] && apt[nx][ny] == 1) {
                visited[nx][ny] = true;
                cnt++;
                DFS(nx, ny);
            }
        }
    }

    static boolean isRangeCheck(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}
