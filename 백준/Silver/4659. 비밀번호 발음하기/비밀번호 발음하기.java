import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static String[] message = {"> is acceptable.", "> is not acceptable."};
    static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        char prev;
        int count;
        boolean flag;

        while (!(input = br.readLine()).equals("end")) {
            char[] cArr = input.toCharArray();
            prev = '-';
            count = 0;
            flag = false;

            for (char c : cArr) {
                if (isVowel(c)) flag = true;

                if (isVowel(c) != isVowel(prev)) count = 1;
                else count++;

                if (count > 2 || (prev == c && (c != 'e' && c != 'o'))) {
                    flag = false;
                    break;
                }

                prev = c;
            }

            if (flag) sb.append('<').append(input).append(message[0]).append("\n");
            else sb.append('<').append(input).append(message[1]).append("\n");
        }

        System.out.print(sb);
    }

    static boolean isVowel(char ch) {
        return vowels.contains(ch);
    }
}