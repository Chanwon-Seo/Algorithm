import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<String> lStack = new Stack<>();
        Stack<String> rStack = new Stack<>();

        String[] arr = str.split("");
        for (String s : arr) {
            lStack.push(s);
        }

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L':
                    if (!lStack.isEmpty())
                        rStack.push(lStack.pop());

                    break;
                case 'D':
                    if (!rStack.isEmpty())
                        lStack.push(rStack.pop());

                    break;
                case 'B':
                    if (!lStack.isEmpty()) {
                        lStack.pop();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    lStack.push(String.valueOf(t));
                    break;
                default:
                    break;
            }
        }

        while (!lStack.isEmpty()) {
            rStack.push(lStack.pop());
        }
        while (!rStack.isEmpty()) {
            sb.append(rStack.pop());
        }
        System.out.print(sb);
    }
}