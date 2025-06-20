import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int ans = Math.abs(a - b);

        for (int i = 0; i < n; i++) {
            int favorite = Integer.parseInt(br.readLine());

            ans = Math.min(Math.abs(b - favorite) + 1, ans);
        }
        System.out.println(ans);
    }
}