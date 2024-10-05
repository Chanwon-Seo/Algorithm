import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cnt = 0;
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList<Integer> dq = new LinkedList<>();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            dq.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int index = dq.indexOf(arr[i]);
            int mid = 0;

            if (dq.size() % 2 == 0) {
                mid = dq.size() / 2 - 1;
            } else {
                mid = dq.size() / 2;
            }

            if (index <= mid) {
                for (int j = 0; j < index; j++) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
            } else {
                for (int j = 0; j < dq.size() - index; j++) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.pollFirst();
        }

        System.out.println(cnt);

    }

}