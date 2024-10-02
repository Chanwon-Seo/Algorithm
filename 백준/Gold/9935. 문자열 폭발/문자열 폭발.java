import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String boom = br.readLine();
        int inputLength = input.length();
        int boomLength = boom.length();

        for (int i = 0; i < inputLength; i++) {
            sb.append(input.charAt(i));

            if (sb.length() >= boomLength) {
                boolean flag = true;
                for (int j = 0; j < boomLength; j++) {
                    char ch1 = sb.charAt(sb.length() - boomLength + j);
                    char ch2 = boom.charAt(j);
                    if (ch1 != ch2) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.delete(sb.length() - boomLength, sb.length());
                }
            }
        }
        System.out.println(sb.length() == 0 ? "FRULA" : sb);
    }
}