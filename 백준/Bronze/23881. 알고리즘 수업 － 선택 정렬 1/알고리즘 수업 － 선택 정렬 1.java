import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static int[] a;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        sort();
        System.out.print(sb);
    }

    static void sort() {
        int cnt = 0;
        for (int i = a.length - 1; i > 0; i--) {
            int maxIdx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[maxIdx]) {
                    maxIdx = j;
                }
            }

            if (maxIdx != i) {
                int tmp = a[maxIdx];
                a[maxIdx] = a[i];
                a[i] = tmp;
                cnt++;
                if (cnt == k) {
                    sb.append(a[maxIdx]).append(" ").append(a[i]);
                    return;
                }
            }
        }
        if (cnt < k) {
            sb.append(-1);
        }
    }
}