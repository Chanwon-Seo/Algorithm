import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int T, N, M;
    static Integer[] A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int ti = 0; ti < T; ti++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            A = new Integer[N];
            B = new Integer[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A, Collections.reverseOrder());
            Arrays.sort(B, Collections.reverseOrder());

            int result = 0;
            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < M; j++) {
                    if (A[i] > B[j]) {
                        result += M - cnt;
                        break;
                    } else {
                        cnt++;
                    }
                }
            }
            sb.append(result).append("\n");

        }
        System.out.print(sb);
    }

}