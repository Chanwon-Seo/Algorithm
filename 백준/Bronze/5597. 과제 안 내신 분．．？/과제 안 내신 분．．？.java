import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static boolean[] arr = new boolean[31];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i < 31; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}