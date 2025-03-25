import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, D, K, C;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for (int n = 0; n < N; n++) {
            arr[n] = Integer.parseInt(br.readLine());
        }

        System.out.println(search());
    }

    static int search() {
        int ans = 0, count = 0;
        int[] check = new int[D + 1];

        for (int k = 0; k < K; k++) {
            if (check[arr[k]] == 0) count++;
            check[arr[k]]++;
        }

        for (int n = 0; n < N; n++) {
            if (check[C] == 0) {
                ans = Math.max(ans, count + 1);
            } else {
                ans = Math.max(ans, count);
            }

            check[arr[n]]--;
            if (check[arr[n]] == 0) {
                count--;
            }
            if (check[arr[(n + K) % N]] == 0) {
                count++;
            }
            check[arr[(n + K) % N]]++;
        }
        return ans;
    }
}