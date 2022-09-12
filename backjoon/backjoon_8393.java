package backjoon;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = i + result;
        }

        System.out.println(result);
    }
}