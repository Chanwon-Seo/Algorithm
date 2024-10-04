import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }
        int max = 0;
        int cnt = 0;

        for (int i = M; i <= N; i++) {
            int result = arr[i] - arr[i - M];
            if (result == max) {
                cnt++;
            } else if (result > max) {
                max = result;
                cnt = 1;
            }
        }

        if (max == 0) sb.append("SAD");
        else sb.append(max).append("\n").append(cnt);

        System.out.println(sb);

    }

}