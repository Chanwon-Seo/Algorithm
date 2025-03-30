import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] numbers = new String[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = br.readLine();
            }
            Arrays.sort(numbers);
            sb.append(search(numbers)).append("\n");
        }
        System.out.println(sb);
    }

    static String search(String[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1].startsWith(numbers[i])) {
                return "NO";
            }
        }
        return "YES";
    }
}