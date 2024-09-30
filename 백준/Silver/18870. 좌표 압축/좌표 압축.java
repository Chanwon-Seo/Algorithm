import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        int left = 0, right = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            right = Math.max(arr[i], right);
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int depth = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, depth);
                depth++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);

    }

}