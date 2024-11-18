import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int ans = -1;
        for (int i = N - 3; i >= 0; i--) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                ans = arr[i] + arr[i + 1] + arr[i + 2];
                break;
            }
        }
        System.out.println(ans);
    }
}