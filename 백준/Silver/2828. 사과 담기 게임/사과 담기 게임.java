import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int ans = 0;
        int start = 1, end = m;

        for (int i = 0; i < j; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (start > apple) {
                ans += start - apple;
                end -= start - apple;
                start = apple;
            } else if (end < apple) {
                ans += apple - end;
                start += apple - end;
                end = apple;
            }
        }
        System.out.println(ans);
    }
}