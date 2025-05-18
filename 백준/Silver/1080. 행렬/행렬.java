import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] A = new char[n][m];
        char[][] B = new char[n][m];
        for (int i = 0; i < n; i++) {
            A[i] = in.readLine().replace(" ", "").toCharArray();
        }

        for (int i = 0; i < n; i++) {
            B[i] = in.readLine().replace(" ", "").toCharArray();
        }

        int answer = 0;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                if (A[i][j] != B[i][j]) {
                    answer++;
                    for (int ni = i; ni < i + 3; ni++) {
                        for (int nj = j; nj < j + 3; nj++) {
                            if (A[ni][nj] == '0') A[ni][nj] = '1';
                            else A[ni][nj] = '0';
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] != B[i][j]) {
                    answer = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}