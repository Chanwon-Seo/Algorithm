import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && a == c && b == c) {
            sb.append(String.format("%d", 10000 + (a * 1000)));
        } else if (a != b && a != c && b != c) {
            int max = Math.max(a, Math.max(b, c));
            sb.append(String.format("%d", max * 100));
        } else {
            if (a == b) {
                sb.append(String.format("%d", 1000 + (a * 100)));
            } else if (a == c) {
                sb.append(String.format("%d", 1000 + (a * 100)));
            } else {
                sb.append(String.format("%d", 1000 + (b * 100)));
            }
        }
        System.out.println(sb);
    }
}