import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] splitA = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(splitA[i]);
        }

        String[] splitB = br.readLine().split(" ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(splitB[i]);
        }

        if (Arrays.equals(a, b)) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    if (a[j] == b[j] && a[j + 1] == b[j + 1] && Arrays.equals(a, b)) {
                        System.out.println(1);
                        return;
                    }
                }
            }

        }

        System.out.println(0);
    }

}