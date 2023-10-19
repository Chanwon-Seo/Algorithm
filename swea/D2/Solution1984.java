import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = null;
        int[] arr = null;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            arr = new int[10];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int sum = 0;

            for (int z = 1; z < arr.length - 1; z++) {
                sum += arr[z];
            }
            sb.append(String.format("#%d %d\n", i + 1, Math.round(sum / 8.0)));
        }
        System.out.println(sb);
    }
}
