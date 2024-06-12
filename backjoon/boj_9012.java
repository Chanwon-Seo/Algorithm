package backjoon;

import java.io.*;
import java.util.*;

public class boj_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = null;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            stack = new Stack<Character>();
            String str = br.readLine();
            boolean flag = true;
            if (str.length() % 2 != 0) {
                sb.append("NO\n");
                continue;
            } else {
                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if (ch == '(') {
                        stack.push(ch);
                    } else {
                        if (stack.size() > 0) {
                            stack.pop();
                        } else if (stack.size() == 0) {
                            flag = false;
                            continue;
                        }
                    }

                }
            }
            if (stack.size() == 0 && flag) {
                sb.append("YES\n");
            } else if (stack.size() > 0 || !flag) {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}
