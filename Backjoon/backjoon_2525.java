package backjoon;

import java.util.Scanner;

public class backjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int plus = sc.nextInt();

        int a = h * 60 + m + plus;
        h = a / 60;
        m = a % 60;

        if (h >= 24) {
            h = h - 24;
        }

        System.out.println(h + " " + m);
    }
}
