package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수형 배열 26칸
        // 대문자, 소문자 입력 받아 char로 저장
        // 마지막에 max값을 판별하여 출력
        int[] arr = new int[26];
        String N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            if ('A' <= N.charAt(i) && 'Z' >= N.charAt(i)) {
                arr[N.charAt(i) - 'A']++;
            } else {
                arr[N.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        char ch = '?';
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                ch = (char) (j + 65);
            } else if (arr[j] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}