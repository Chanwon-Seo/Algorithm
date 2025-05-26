import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                int startIndex = Math.max(i - k, 0);
                int endIndex = Math.min(i + k, n - 1);
                for (int j = startIndex; j <= endIndex; j++) {
                    if (arr[j] == 'H') {
                        count++;
                        arr[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}