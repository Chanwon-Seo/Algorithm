import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K, X;
    static boolean[] visited;
    static ArrayList<Integer>[] map;
    static Queue<Point> Q = new LinkedList<>();
    static ArrayList<Integer> result = new ArrayList<>();

    static class Point {
        int x, depth;

        public Point(int x, int depth) {
            this.x = x;
            this.depth = depth;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        map = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }
        Q.offer(new Point(X, 0));

        bfs();

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);

            for (Integer i : result) {
                sb.append(i).append("\n");
            }
            System.out.print(sb);
        }

    }

    static void bfs() {
        while (!Q.isEmpty()) {
            Point point = Q.poll();
            int nx = point.x;
            int nDepth = point.depth;
            visited[point.x] = true;
            if (nDepth == K) {
                result.add(nx);
            }

            for (int i = 0; i < map[nx].size(); i++) {
                if (!visited[map[nx].get(i)] && !map[nx].isEmpty()) {
                    Q.offer(new Point(map[nx].get(i), nDepth + 1));
                    visited[map[nx].get(i)] = true;
                }
            }
        }

    }

}