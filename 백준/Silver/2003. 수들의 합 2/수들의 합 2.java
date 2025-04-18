import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0, left = 0, right = 0, ans = 0;

        while (right <= n) {
            if (sum >= m) {
                sum -= arr[left++];
            } else {
                sum += arr[right++];
            }
            if (sum == m) ans++;
        }

        System.out.println(ans);

    }

}