import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = "";
        while ((input = br.readLine()) != null) {
            int upper = 0, lower = 0, num = 0, space = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) upper++;
                if (Character.isLowerCase(c)) lower++;
                if (Character.isDigit(c)) num++;
            }
            sb.append(lower).append(" ");
            sb.append(upper).append(" ");
            sb.append(num).append(" ");
            sb.append(space).append(" ");
        }
        System.out.print(sb);
    }
}