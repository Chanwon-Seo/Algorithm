import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0) {
                sum += num;
                if (min > num) {
                    min = num;
                }
            }
        }

        if (sum == 0) {
            System.out.printf("%d", -1);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}
