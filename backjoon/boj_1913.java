package backjoon;

import java.io.*;

public class boj_1913 {
    static int[][] arr;
    static int i = 0, j = 0;

    public static int solution(int[][] arr, int num) {
        if (arr[i][j] == 0) {
            arr[i][j] = num;
            num--;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int loopN = N;

        int[][] arr = new int[loopN][loopN];
        int num = loopN * loopN;

        int count = 0;

        while (num > 1) {

            for (; i < loopN - 1; i++) {
                num = solution(arr, num);
            }

            for (; j < loopN - 1; j++) {
                num = solution(arr, num);
            }

            for (; i > count; i--) {
                num = solution(arr, num);
            }

            for (; j > count; j--) {
                num = solution(arr, num);
            }

            i++;
            j++;
            count++;
            loopN--;
        }

        StringBuilder sb = new StringBuilder();
        arr[i][j] = num;
        int x = 0;
        int y = 0;

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == M) {
                    x = i + 1;
                    y = j + 1;
                }
            }
            sb.append("\n");
        }

        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }


}