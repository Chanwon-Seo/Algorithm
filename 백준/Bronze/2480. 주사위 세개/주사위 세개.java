import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int price = 0;
        if (a == b && b == c) {
            price = 10000 + a * 1000;
        } else if (a == b || a == c) {
            price = 1000 + a * 100;
        } else if (b == c) {
            price = 1000 + b * 100;
        } else {
            price = Math.max(a, Math.max(b, c)) * 100;
        }
        System.out.println(price);
    }
}