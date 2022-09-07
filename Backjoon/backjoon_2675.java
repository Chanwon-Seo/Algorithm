package Main;

import java.util.Scanner;

public class algorithm_2675 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			// 문자열 S 입력 받기
			int R = sc.nextInt();
			String S = sc.next();

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
