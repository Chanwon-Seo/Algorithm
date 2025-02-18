import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int expected = 1;
        int index = 0;

        while (index < n || !stack.isEmpty()) {
            if (index < n && students[index] == expected) {
                index++;
                expected++;
            } else if (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            } else if (index < n) {
                stack.push(students[index]);
                index++;
            } else {
                break;
            }
        }

        System.out.println(expected > n ? "Nice" : "Sad");
    }
}
