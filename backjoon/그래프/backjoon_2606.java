package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int node, line;
    static StringTokenizer st;
    static int[][] arr;
    static boolean[] check;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        int ans = dfs(1);
        System.out.println(ans - 1);

    }

    static int dfs(int start) {
        check[start] = true;
        count++;
        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
        return count;
    }
}