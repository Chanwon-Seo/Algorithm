import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i = n - 1; i >= 1; i--) {
            int diff = arr[i] - arr[i - 1];
            if (diff <= 0) {
                int num = Math.abs(diff) + 1;
                sum += num;
                arr[i - 1] -= num;
            }
        }
        System.out.println(sum);
    }
}