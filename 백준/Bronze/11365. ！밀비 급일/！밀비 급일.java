import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder resultSB = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = "";
        while (!(input = br.readLine()).equals("END")) {
            StringBuilder reverse = new StringBuilder(input).reverse();
            resultSB.append(reverse).append("\n");
        }
        System.out.println(resultSB);
    }

}