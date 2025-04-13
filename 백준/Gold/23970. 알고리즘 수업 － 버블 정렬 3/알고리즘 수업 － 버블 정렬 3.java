import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] a = input(new int[n], n);
        int[] b = input(new int[n], n);

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

    static int[] input(int[] arr, int length) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

}