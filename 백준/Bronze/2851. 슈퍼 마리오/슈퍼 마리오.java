import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[11];
        for (int i = 1; i <= 10; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(br.readLine());
        }
        int max = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 10; i > 0; i--) {
            int temp = Math.abs(100 - arr[i]);
            if (max > temp) {
                max = temp;
                answer = arr[i];
            }
        }
        System.out.println(answer);
    }
}