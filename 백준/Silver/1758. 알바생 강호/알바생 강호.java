import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, Comparator.reverseOrder());

        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] - i <= 0) break;
            ans += arr[i] - i;
        }
        System.out.print(ans);
    }
}