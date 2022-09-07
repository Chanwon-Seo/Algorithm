package backjoon;

import java.util.Scanner;

public class backjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt() * sc.nextInt() * sc.nextInt();
        String strVal = Integer.toString(sum);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < strVal.length(); j++) {
                if ((strVal.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
