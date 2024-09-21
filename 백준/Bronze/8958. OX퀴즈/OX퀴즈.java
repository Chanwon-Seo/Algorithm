import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') cnt++;
                else cnt = 0;
                sum += cnt;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}