import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int max = 0;
        int n = 0;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (max < sum) {
                max = sum;
                n = i + 1;
            }
        }
        sb.append(n).append(" ").append(max);
        System.out.println(sb);

    }
}