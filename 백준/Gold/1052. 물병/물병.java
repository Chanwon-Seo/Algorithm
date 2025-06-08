import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = 0, index = -1;
        String bitInput = Integer.toBinaryString(n);
        int one = Integer.bitCount(n);

        if (one > k) {
            for (int i = 0; i < bitInput.length(); i++) {
                if (k == 0) {
                    index = i;
                    break;
                }
                if (bitInput.charAt(i) == '1') {
                    k--;
                }
            }

            String temp = bitInput.substring(index);
            int t = Integer.parseInt(temp, 2);
            if (t != 0) {
                answer = (int) (Math.pow(2, bitInput.length() - index) - t);
            }
        }
        System.out.println(answer);
    }
}