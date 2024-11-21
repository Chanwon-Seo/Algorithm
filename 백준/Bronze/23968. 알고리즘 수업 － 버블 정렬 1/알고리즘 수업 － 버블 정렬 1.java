import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static String ans = "";

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] a = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(a);

        System.out.println(ans);
    }

    static void bubbleSort(int[] a) {
        int cnt = 0;
        for (int last = N; last >= 2; last--) {
            for (int i = 1; i <= last - 1; i++)
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    cnt++;
                    if (cnt == K) {
                        ans = a[i] + " " + a[i + 1];
                        return;
                    }
                }
        }
        ans = "-1";
    }
}