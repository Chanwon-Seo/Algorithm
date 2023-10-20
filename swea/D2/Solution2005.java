import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] arr = null;

        for (int Ti = 0; Ti < T; Ti++) {
            int N = Integer.parseInt(br.readLine());

            arr = new int[N][N];
            arr[0][0] = 1;
            sb.append(String.format("#%d\n", Ti + 1));

            int count = 1;
            for (int i = 1; i <= N - 1; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == 0) {
                        arr[i][j] = 1;
                        continue;
                    }
                    if (j == count) {
                        arr[i][j] = 1;
                        count++;
                        break;
                    }

                    for (int z = 0; z < 2; z++) {
                        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    }
                    count++;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0) {
                        sb.append("\n");
                        break;
                    }
                    sb.append(String.format("%d ", arr[i][j]));
                }

            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}