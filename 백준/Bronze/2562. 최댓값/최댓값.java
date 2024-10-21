import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int max = 0;
        int idx = 1;

        for (int i = 1; i <= 9; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > max) {
                max = input;
                idx = i;
            }
        }
        sb.append(max).append("\n").append(idx);
        System.out.print(sb);
    }
}