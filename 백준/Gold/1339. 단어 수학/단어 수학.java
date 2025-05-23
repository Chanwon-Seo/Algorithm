import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                arr[c - 'A'] += (int) Math.pow(10, input.length() - 1 - j);
            }
        }

        Arrays.sort(arr);

        int num = 9;
        int turn = 25;
        int ans = 0;
        while (arr[turn] != 0) {
            ans += arr[turn] * num;
            turn--;
            num--;
        }

        System.out.print(ans);
    }
}