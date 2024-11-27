import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int number = 666;
        int cnt = 1;
        while (cnt != n) {
            number++;
            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.println(number);
    }

}