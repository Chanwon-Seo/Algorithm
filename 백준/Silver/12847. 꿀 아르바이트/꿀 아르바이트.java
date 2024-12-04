import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static Long[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new Long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;

        for (int i = 0; i < M; i++) {
            sum += arr[i];
        }

        long max = sum;
        for (int j = 0; j + M < N; j++) {
            sum -= arr[j];
            sum += arr[j + M];
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }

}