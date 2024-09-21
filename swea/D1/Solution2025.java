import java.io.*;

public class Solution2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}