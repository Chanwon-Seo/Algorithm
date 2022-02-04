package backjoon;

import java.util.Scanner;

public class backjoon_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String[] word_arr = word.split(" ");
        if (word_arr.length == 0) {
            System.out.println(0);
            System.exit(0);
        }
        if (word_arr[0] == "") {
            System.out.println(word_arr.length - 1);
        } else {
            System.out.println(word_arr.length);
        }
    }
}
