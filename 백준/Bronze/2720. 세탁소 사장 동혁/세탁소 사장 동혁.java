import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[]{25, 10, 5, 1};
    static int[] result;
    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int ti = 0; ti < T; ti++) {
            int C = Integer.parseInt(br.readLine());
            result = new int[4];
            for (int i = 0; i < 4; i++) {
                result[i] = C / arr[i];
                C %= arr[i];
            }

            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}