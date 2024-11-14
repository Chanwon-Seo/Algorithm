import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int hamburger = 2001;
        for (int i = 0; i < 3; i++) {
            hamburger = Math.min(hamburger, Integer.parseInt(br.readLine()));
        }
        int drink = 2001;
        for (int i = 0; i < 2; i++) {
            drink = Math.min(drink, Integer.parseInt(br.readLine()));
        }
        System.out.println(hamburger + drink - 50);
    }
}