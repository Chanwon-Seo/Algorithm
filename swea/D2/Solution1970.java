import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int value = 0;

            sb.append(String.format("#%d\n", i + 1));

            for (int j = 0; j < arr.length - 1; j++) {
                value = N / arr[j];
                N = N % arr[j];
                sb.append(String.format("%d ", value));
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}