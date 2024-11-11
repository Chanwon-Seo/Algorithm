import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s = "";
        int result = 0;
        char c;
        for (int i = 1; i <= N; i++) {
            s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                c = s.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}