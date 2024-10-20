import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] arr = {300, 60, 10};
    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        if (T % 10 != 0) {
            sb.append("-1");
        } else {
            for (int i = 0; i < 3; i++) {
                sb.append(T / arr[i]).append(" ");
                T %= arr[i];
            }
        }
        System.out.print(sb);
    }

}