import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String input;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws IOException {
        input = br.readLine();
        arr = new ArrayList<Integer>();

        for (int i = 0; i < input.length(); i++) {
            arr.add(input.charAt(i) - 48);
        }

        arr.sort(Collections.reverseOrder());

        for (Integer num : arr) {
            sb.append(num);
        }
        System.out.print(sb);
    }

}