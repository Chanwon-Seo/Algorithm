import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if (N % 4 == 0 && (N % 100 != 0 || N % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}