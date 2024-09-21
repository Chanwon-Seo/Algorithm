import java.io.*;
import java.util.StringTokenizer;

public class Solution2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = null;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int count = st.countTokens();

            for (int j = 0; j < count; j++) {

                int num = Integer.parseInt(st.nextToken());

                if (num % 2 == 0) {
                    continue;
                }
                sum += num;
            }

            sb.append("#").append(i + 1).append(" " + sum).append("\n");
        }

        System.out.println(sb);
    }
}
