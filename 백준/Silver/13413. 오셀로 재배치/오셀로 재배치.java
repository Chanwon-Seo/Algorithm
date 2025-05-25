import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String start = br.readLine();
            String end = br.readLine();
            int cntW = 0, cntB = 0;

            for (int j = 0; j < n; j++) {
                if (start.charAt(j) != end.charAt(j)) {
                    if (start.charAt(j) == 'W') cntB++;
                    else cntW++;
                }
            }

            sb.append(Math.max(cntB, cntW)).append("\n");
        }
        System.out.print(sb);
    }
}