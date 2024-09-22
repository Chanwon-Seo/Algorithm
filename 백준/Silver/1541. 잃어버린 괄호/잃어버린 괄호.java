import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        StringTokenizer stSub = new StringTokenizer(br.readLine(), "-");
        while (stSub.hasMoreTokens()) {
            int num = 0;
            StringTokenizer stAdd = new StringTokenizer(stSub.nextToken(), "+");
            while (stAdd.hasMoreTokens()) {
                num += Integer.parseInt(stAdd.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = num;
            } else {
                sum -= num;
            }
        }
        System.out.println(sum);
    }
}
