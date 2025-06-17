import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int m = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (m < arr[j]) break;
                else count++;
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}