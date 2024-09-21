import java.io.*;
import java.util.StringTokenizer;

public class Solution2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            int max = Integer.MIN_VALUE;
            int num = 0;
            for (int j = 0; j < count; j++) {
                num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                }
            }

            sb.append("#").append(i + 1).append(" ").append(max).append("\n");
        }
        System.out.println(sb);

    }
}