import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[46];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < 46; i++) arr[i] = arr[i - 1] + arr[i - 2];

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 45; j > 0; j--) {
                if (arr[j] <= num) {
                    num -= arr[j];
                    stack.add(arr[j]);
                    if (num == 0) break;
                }
            }

            while (!stack.empty()) sb.append(stack.pop()).append(" ");
            if (i < t - 1) sb.append("\n");
        }
        System.out.print(sb);
    }
}