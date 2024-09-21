import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> o2[2] - o1[2]);

        int last = 2;
        if (arr[0][0] == arr[1][0]) {
            for (int i = 2; i < n; i++) {
                if (arr[0][0] != arr[i][0]) {
                    last = i;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0][0]).append(" ").append(arr[0][1]).append("\n");
        sb.append(arr[1][0]).append(" ").append(arr[1][1]).append("\n");
        sb.append(arr[last][0]).append(" ").append(arr[last][1]);
        System.out.println(sb);
    }
}