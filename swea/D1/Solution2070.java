import java.io.*;
import java.util.StringTokenizer;

public class Solution2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("#").append(i+1);

            if (a > b) {
                sb.append(" >").append("\n");
            } else if (a < b) {
                sb.append(" <").append("\n");
            } else {
                sb.append(" =").append("\n");
            }
        }
        System.out.println(sb);
    }
}