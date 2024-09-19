package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.youtube.com/watch?v=ftOmGdm95XI&t=749s
 * import java.io.*;
 * import java.util.*;
 *
 * public class Main {
 *     static int n, m;
 *     static String[] board;
 *     static int[][] dist;
 *     static int[] dx = {1, 0, -1, 0};
 *     static int[] dy = {0, 1, 0, -1};
 *
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         n = Integer.parseInt(st.nextToken());
 *         m = Integer.parseInt(st.nextToken());
 *         board = new String[n];
 *         dist = new int[n][m];
 *
 *         for (int i = 0; i < n; i++) {
 *             board[i] = br.readLine();
 *         }
 *
 *         for (int i = 0; i < n; i++) {
 *             Arrays.fill(dist[i], -1);
 *         }
 *
 *         Queue<int[]> q = new LinkedList<>();
 *         q.offer(new int[]{0, 0});
 *         dist[0][0] = 0;
 *
 *         while (!q.isEmpty()) {
 *             int[] cur = q.poll();
 *             int x = cur[0];
 *             int y = cur[1];
 *
 *             for (int dir = 0; dir < 4; dir++) {
 *                 int nx = x + dx[dir];
 *                 int ny = y + dy[dir];
 *
 *                 if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
 *                 if (dist[nx][ny] >= 0 || board[nx].charAt(ny) != '1') continue;
 *
 *                 dist[nx][ny] = dist[x][y] + 1;
 *                 q.offer(new int[]{nx, ny});
 *             }
 *         }
 *
 *         System.out.println(dist[n-1][m-1] + 1); // 문제의 특성상 거리 +1이 정답
 *     }
 * }
 */
public class boj_1926 {
    static int N, M, size;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        boolean zero = true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (num == 1) {
                    zero = false;
                }
            }
        }
        if (zero) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    size = 0;
                    BFS(i, j);
                    arr.add(size);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(arr.size() - 1));
    }

    static void BFS(int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, j));
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            size++;
            Point p = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + p.x;
                int ny = dy[k] + p.y;
                if (isRoundCheck(nx, ny)) {
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
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
