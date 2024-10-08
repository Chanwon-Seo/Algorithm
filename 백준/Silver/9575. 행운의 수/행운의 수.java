import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int T, N, M, K;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] A, B, C;
    static Set<Integer> set;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            A = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            M = Integer.parseInt(br.readLine());
            B = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            K = Integer.parseInt(br.readLine());
            C = new int[K];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < K; i++) {
                C[i] = Integer.parseInt(st.nextToken());
            }
            set = new HashSet<>();
            for (int i : A) {
                for (int j : B) {
                    for (int k : C) {
                        int sum = i + j + k;

                        boolean isValid = true;
                        int tempSum = sum;
                        while (tempSum != 0) {
                            int lastDigit = tempSum % 10;
                            if (lastDigit != 5 && lastDigit != 8) {
                                isValid = false;
                                break;
                            }
                            tempSum /= 10;
                        }

                        if (isValid) {
                            set.add(sum);
                        }
                    }
                }
            }
            sb.append(set.size()).append("\n");
        }
        System.out.println(sb);
    }
}
