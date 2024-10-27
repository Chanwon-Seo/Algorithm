import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String S;

    public static void main(String[] args) throws IOException {
        S = br.readLine();
        int length = S.length();
        int[] arr = new int[26];

        for (int i = 0; i < length; i++) {
            arr[S.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}