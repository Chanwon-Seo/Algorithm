import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int A;

    public static void main(String[] args) throws IOException {
        A = Integer.parseInt(br.readLine());
        System.out.println(A - (A / 11));
    }
}