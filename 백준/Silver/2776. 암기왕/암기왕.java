import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int T, N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int input = Integer.parseInt(st.nextToken());
                sb.append(BS(input)).append("\n");
            }
        }
        System.out.println(sb);

    }

    static int BS(int input) {
        int left = 0, right = N - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (input == arr[mid]) {
                return 1;
            } else if (input < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}