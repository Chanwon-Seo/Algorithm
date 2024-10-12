import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if (N >= 90) {
            System.out.println("A");
        } else if (N >= 80) {
            System.out.println("B");
        } else if (N >= 70) {
            System.out.println("C");
        } else if (N >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}