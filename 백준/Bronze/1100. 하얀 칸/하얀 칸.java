import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (input.charAt(j) == 'F' && (i + j) % 2 == 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}