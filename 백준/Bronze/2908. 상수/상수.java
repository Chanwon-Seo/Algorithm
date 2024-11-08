import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < 2; i++) {
            StringBuilder reverse = new StringBuilder(st.nextToken()).reverse();
            max = Math.max(max, Integer.parseInt(reverse.toString()));
        }
        System.out.println(max);
    }
}