package backjoon;

import java.util.Scanner;

public class backjoon_25304 {
    public static void main(String[] args) {
        //구매한 각 물건의 가격과 개수
        //구매한 물건들의 총 금액

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            result += price * count;
        }

        System.out.println((result == x) ? "Yes" : "No");
    }

}
