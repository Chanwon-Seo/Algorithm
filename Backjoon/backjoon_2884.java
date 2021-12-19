package backjoon;

import java.util.Scanner;

public class backjoon_2884 {
    public static void main(String[] args) {
        /**
         *
         * 만약 분이 45보다 적을 경우 !
         * 1시간 감소
         * 분 감소
         *      만약 시가 0보다 작을 경우
         *       시 = 23
         * 아닐 경우
         * 45분 감소
         */
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            h--;
            m = 60 + (m - 45);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
