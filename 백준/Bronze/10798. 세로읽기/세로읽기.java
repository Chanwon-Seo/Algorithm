import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static char[][] arr = new char[5][15];

    public static void main(String[] args) throws IOException {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            max = Math.max(input.length(), max);

            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != '\0') sb.append(arr[j][i]);
            }
        }
        System.out.print(sb);
    }

}