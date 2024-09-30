import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] treeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        treeList = new int[N];
        st = new StringTokenizer(br.readLine());
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            treeList[i] = Integer.parseInt(st.nextToken());
            end = Math.max(treeList[i], end);
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (treeList[i] - mid > 0) {
                    sum += treeList[i] - mid;
                }
            }
            if (sum >= M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }

}