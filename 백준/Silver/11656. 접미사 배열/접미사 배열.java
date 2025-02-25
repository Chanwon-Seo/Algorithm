import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int length = input.length();
        String[] strArray = new String[length];

        for (int i = 0; i < length; i++) {
            strArray[i] = input.substring(i, length);
        }

        Arrays.sort(strArray);

        for (String str : strArray) {
            System.out.println(str);
        }
    }
}