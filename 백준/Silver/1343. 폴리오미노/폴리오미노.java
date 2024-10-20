import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine()
                .replace("XXXX", "AAAA")
                .replace("XX", "BB");

        System.out.println(input.contains("X") ? -1 : input);
    }
}