import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += input.charAt(i) - 48;
        }

        br.close();
        bw.write(sum + "");
        bw.close();
    }
}
