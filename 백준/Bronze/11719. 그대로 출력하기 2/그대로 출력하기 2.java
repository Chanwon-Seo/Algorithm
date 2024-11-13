import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = "";
        while ((input = br.readLine()) != null) {
            sb.append(input).append("\n");
        }
        System.out.print(sb);
    }
}