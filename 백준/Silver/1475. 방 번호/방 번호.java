import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String N;
    static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {
        N = br.readLine();
        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - 48;
            if (num == 6) {
                num = 9;
            }
            arr[num]++;

        }

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        int nine = arr[9] / 2;
        if (arr[9] % 2 == 1) nine++;
        max = Math.max(max, nine);
        System.out.println(max);
    }
}