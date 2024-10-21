import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            set.add(input);
            sb = new StringBuilder(input);
            String reverseStr = sb.reverse().toString();
            if (set.contains(reverseStr)) {
                System.out.println(reverseStr.length() + " " + reverseStr.charAt(reverseStr.length() / 2));
                break;
            }

        }

    }
}