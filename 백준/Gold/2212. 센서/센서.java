import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        if (k >= n) {
            System.out.println(0);
            return;
        }

        int sum = 0;

        int[] sensors = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) sensors[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(sensors);
        Integer[] differences = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) differences[i] = sensors[i + 1] - sensors[i];

        Arrays.sort(differences, Collections.reverseOrder());

        for (int i = k - 1; i < n - 1; i++) sum += differences[i];

        System.out.println(sum);
    }
}