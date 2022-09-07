package backjoon;

import java.util.Scanner;

public class backjoon_3003 {
    public static void main(String[] args) {
        // 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        /**
         * 입력 요구사항
         * 0 1 2 2 2 7 => 1 0 0 0 0 1
         * 2 1 2 1 2 1 => -1 0 0 1 0 7
         */
        int[] chess_num = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
            input[i] = (chess_num[i] - input[i]);
            System.out.print(input[i] + " ");
        }

    }
}
