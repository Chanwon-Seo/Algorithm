import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int low = 1, high = 0;
        for (int a : arr) {
            if (a > high) {
                high = a;
            }
        }

        while (low < high) {
            int mid = (low + high) / 2;
            long sum = 0;

            for (int a : arr) {
                if (a % mid == 0)
                    sum += a / mid;
                else
                    sum += a / mid + 1;
            }

            if (sum > N) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println(low);
    }
}