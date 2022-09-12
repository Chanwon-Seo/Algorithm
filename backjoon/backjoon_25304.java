package backjoon;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int result = sc.nextInt();
        int count = sc.nextInt();
        int chk_num = 0;

        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            chk_num += price * num;
        }
        if (result == chk_num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}