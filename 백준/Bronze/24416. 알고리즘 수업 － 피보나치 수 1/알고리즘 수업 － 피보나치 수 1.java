import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n) + " " + (n - 2));
    }

    static int fibonacci(int n) {
        int[] fibonaccis = new int[n + 1];
        fibonaccis[1] = fibonaccis[2] = 1;
        for (int i = 3; i <= n; i++) {
            fibonaccis[i] = fibonaccis[i - 1] + fibonaccis[i - 2];
        }
        return fibonaccis[n];
    }
}