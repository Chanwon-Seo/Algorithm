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
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int amount = 0;
        int tired = 0;

        for (int i = 1; i <= 24; i++) {
            if (tired + a <= m) {
                amount += b;
                tired += a;
            } else {
                tired -= c;
                if (tired < 0) tired = 0;
            }
        }

        System.out.println(amount);
    }
}