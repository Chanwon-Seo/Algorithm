import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();
        int totalScore = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if ("1".equals(input[0])) {
                int a = Integer.parseInt(input[1]);
                int t = Integer.parseInt(input[2]) - 1;

                if (t == 0) totalScore += a;
                else stack.push(new int[]{a, t});
            } else {
                if (!stack.isEmpty()) {
                    int[] peek = stack.pop();
                    int a = peek[0];
                    int t = peek[1] - 1;

                    if (t == 0) totalScore += a;
                    else stack.push(new int[]{a, t});
                }
            }
        }
        System.out.println(totalScore);
    }
}