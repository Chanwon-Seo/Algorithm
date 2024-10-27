import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int no = 0, yes = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 1) {
                yes++;
            } else {
                no++;
            }
        }
        System.out.println(yes > no ? "Junhee is cute!" : "Junhee is not cute!");
    }
}