import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int[] arr;

    public static void main(String[] args) throws IOException {
        int mulNum = 1;
        arr = new int[10];

        for (int i = 0; i < 3; i++) {
            mulNum *= Integer.parseInt(br.readLine());
        }

        while (mulNum > 0) {
            arr[mulNum % 10]++;
            mulNum /= 10;
        }

        for (int i = 0; i < 10; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}