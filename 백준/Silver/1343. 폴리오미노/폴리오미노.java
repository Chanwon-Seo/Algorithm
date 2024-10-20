import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine()
                .replace("XXXX", "AAAA")
                .replace("XX", "BB");

        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? -1 : input);
    }
}