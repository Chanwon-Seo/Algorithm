import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        boolean check = false;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '<') {
                check = true;
                sb.append(temp.reverse());
                sb.append(c);
                temp = new StringBuilder();
            } else if (c == '>') {
                check = false;
                sb.append(temp).append(c);
                temp = new StringBuilder();
            } else if (c == ' ') {
                if (check) {
                    temp.append(c);
                } else {
                    sb.append(temp.reverse()).append(c);
                    temp = new StringBuilder();
                }
            } else {
                temp.append(c);
            }
        }
        if (!temp.equals("")) {
            sb.append(temp.reverse());
        }
        System.out.print(sb);
    }
}