import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        while (index < n) {
            if (!stack.empty() && arr[index] < stack.get(stack.size() - 1)) {
                break;
            } else if (!stack.empty() && arr[index] == stack.get(stack.size() - 1)) {
                stack.pop();
                sb.append("-").append("\n");
                index++;
            } else {
                while (num <= n) {
                    if (arr[index] != num) {
                        stack.push(num);
                        sb.append("+").append("\n");
                        num++;
                    } else {
                        stack.push(num);
                        sb.append("+").append("\n");
                        num++;
                        break;
                    }
                }
            }
        }

        if (index == n) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }

}