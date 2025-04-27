import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[5];
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for (int a = 0; a < 3; a++) {
                for (int b = a + 1; b < 4; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        sum = Math.max(sum, (num[a] + num[b] + num[c]) % 10);
                    }
                }
            }

            result[i] = sum;
        }

        int max = result[1];
        int answer = 1;
        for (int i = 2; i < result.length; i++) {
            if (max <= result[i]) {
                max = result[i];
                answer = i;
            }
        }
        System.out.println(answer);
    }
}