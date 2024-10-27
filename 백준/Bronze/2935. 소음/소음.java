import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BigInteger A = new BigInteger(br.readLine());
        String op = br.readLine();
        if ("*".equals(op)) {
            System.out.println(A.multiply(new BigInteger(br.readLine())));
        } else {
            System.out.println(A.add(new BigInteger(br.readLine())));
        }
    }
}