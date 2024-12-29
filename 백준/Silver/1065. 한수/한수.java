import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i / 100 == 0)
                count++;

            else if (i / 1000 == 0) {
                int hund = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;

                if (hund - ten == ten - one)
                    count++;
            }
        }

        System.out.println(count);
    }
}