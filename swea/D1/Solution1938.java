import java.io.*;
import java.util.*;

public class Solution1938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a + b).append("\n")
                .append(a - b).append("\n")
                .append(a * b).append("\n")
                .append(a / b).append("\n");
        System.out.println(sb);
    }
}