import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (set.contains(x - arr[i])) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}