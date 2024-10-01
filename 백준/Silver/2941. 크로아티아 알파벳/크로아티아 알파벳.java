import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < 8; i++) {
            if (input.contains(list[i])) {
                input = input.replace(list[i], "@");
            }
        }
        System.out.println(input.length());

    }
}