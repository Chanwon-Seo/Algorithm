import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int len = arr[0].length();

        for (int i = 0; i < len; i++) {
            boolean b = true;
            char c = arr[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (c != arr[j].charAt(i)) b = false;
            }
            if (b) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.print(sb);
    }
}
