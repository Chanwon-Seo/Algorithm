import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, T;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int ti = 0; ti < T; ti++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[N - 1];
            long ans = 0;
            for (int i = N - 2; i >= 0; i--) {
                if (max >= arr[i]) {
                    ans += max - arr[i];
                } else {
                    max = arr[i];
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

}
