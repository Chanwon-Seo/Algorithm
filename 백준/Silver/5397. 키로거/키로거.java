import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Stack<Character> lStack = new Stack<>();
            Stack<Character> rStack = new Stack<>();
            String input = br.readLine();

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (!lStack.empty()) {
                            rStack.push(lStack.pop());
                        }
                        break;
                    case '>':
                        if (!rStack.empty()) {
                            lStack.push(rStack.pop());
                        }
                        break;
                    case '-':
                        if (!lStack.empty()) {
                            lStack.pop();
                        }
                        break;
                    default:
                        lStack.push(ch);
                        break;
                }
            }
            StringBuilder sb = new StringBuilder();

            while (!lStack.empty()) {
                rStack.push(lStack.pop());
            }
            while (!rStack.empty()) {
                sb.append(rStack.pop());
            }
            System.out.println(sb);
        }
    }
}