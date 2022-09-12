package backjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = 60 * A + B + C;

        A = (result / 60) % 24;
        B = result % 60;

        System.out.println(A + " " + B);
    }
}