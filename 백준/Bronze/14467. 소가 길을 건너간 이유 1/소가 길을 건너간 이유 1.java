import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(st.nextToken());
            int load = Integer.parseInt(st.nextToken()) + 1;

            if (arr[cowNum] == 0) arr[cowNum] = load;

            if (arr[cowNum] != load) {
                ans++;
                arr[cowNum] = load;
            }
        }
        System.out.print(ans);
    }
}
