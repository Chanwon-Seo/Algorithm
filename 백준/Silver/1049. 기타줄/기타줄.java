import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int pack = Integer.MAX_VALUE, each = Integer.MAX_VALUE, answer;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            each = Math.min(each, Integer.parseInt(st.nextToken()));
        }
        if (each * 6 <= pack) answer = each * n;
        else {
            answer = (n / 6) * pack;
            answer += Math.min(n % 6 * each, pack);

        }
        System.out.println(answer);
    }
}