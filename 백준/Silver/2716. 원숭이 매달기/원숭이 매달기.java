import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            System.out.println(calculateMonkeys(br.readLine()));
        }
    }

    static int calculateMonkeys(String input) {
        int depth = 0;
        int maxDepth = 0;

        for (char c : input.toCharArray()) {
            if (c == '[') {
                depth++;
            } else {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }

        return (int) Math.pow(2, maxDepth);
    }
}