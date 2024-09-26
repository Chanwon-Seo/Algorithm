import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int angle = 60;
    static int totalAngle = 180;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == angle && b == angle && c == angle) {
            System.out.println("Equilateral");
        } else {
            if (a + b + c == totalAngle) {
                if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Error");
            }
        }
    }
}