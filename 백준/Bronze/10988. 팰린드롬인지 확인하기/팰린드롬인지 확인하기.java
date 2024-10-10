import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] input = br.readLine().toCharArray();

        int length = input.length / 2;
        boolean flag = true;
        for (int i = 1; i <= length; i++) {
            if (input[i - 1] != input[input.length - i]) {
                flag = false;
                break;
            }
        }

        br.close();
        if (flag) bw.write(1 + "");
        else bw.write(0 + "");
        bw.close();
    }
}
