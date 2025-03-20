import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchNum = Integer.parseInt(br.readLine());
        boolean[] switches = new boolean[switchNum + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= switchNum; i++) {
            String input = st.nextToken();
            if ("1".equals(input)) switches[i] = true;
        }

        int memberNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < memberNum; i++) {
            st = new StringTokenizer(br.readLine());
            String gender = st.nextToken();
            int index = Integer.parseInt(st.nextToken());

            if ("1".equals(gender)) {
                for (int j = index; j <= switchNum; j += index) {
                    switches[j] = !switches[j];
                }
            } else {
                int left = index - 1;
                int right = index + 1;
                while (0 < left && right <= switchNum) {
                    if (switches[left] != switches[right]) break;
                    left--;
                    right++;
                }

                for (int j = left + 1; j < right; j++) {
                    switches[j] = !switches[j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= switchNum; i++) {
            sb.append(switches[i] ? 1 : 0).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

}