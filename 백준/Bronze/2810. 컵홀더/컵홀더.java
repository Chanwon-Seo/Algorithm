import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int count = 1;

        for (int i = 0; i < input; i++) {
            if (s[i].equals("S")) {
                count++;
                continue;
            }
            i++;
            count++;
        }

        System.out.println(Math.min(input, count));

    }
}
