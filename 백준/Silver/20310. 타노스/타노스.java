import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr = new char[input.length()];

        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.charAt(i);
            if (arr[i] == '0') countZero++;
            else countOne++;
        }
        countZero /= 2;
        countOne /= 2;

        for (int i = 0; i < input.length() && countOne != 0; i++) {
            if (arr[i] == '1') {
                countOne--;
                arr[i] = 0;
            }
        }

        for (int i = input.length() - 1; i >= 0 && countZero != 0; i--) {
            if (arr[i] == '0') {
                countZero--;
                arr[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (arr[i] != 0) sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}