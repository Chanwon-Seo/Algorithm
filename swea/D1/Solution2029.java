import java.io.*;
import java.util.*;

public class Solution2029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("#").append(i + 1).append(" ").append(a / b).append(" ").append(a % b).append("\n");
        }
        System.out.println(sb);
    }
}