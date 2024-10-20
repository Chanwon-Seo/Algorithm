import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        int input = 1000 - Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            if (input / arr[i] > 0) {
                cnt += input / arr[i];
                input = input % arr[i];
            }
        }
        System.out.println(cnt);
    }
}