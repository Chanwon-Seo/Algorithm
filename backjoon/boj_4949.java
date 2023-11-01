package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = null;
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            boolean flag = true;
            if (str.equals(".") && str.length() == 1) {
                break;
            } else {
                stack = new Stack<Character>();
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == '(' || ch == '[') {
                        stack.push(ch);
                    } else if (ch == ')' || ch == ']') {
                        if (!stack.isEmpty()) {
                            char popCh = stack.pop();
                            if ((ch == ')' && popCh == '[') || (ch == ']' && popCh == '(')) {
                                flag = false;
                                break;
                            }
                        } else {
                            flag = false;
                            break;
                        }

                    }
                }

            }
            if (flag && stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);

    }
}