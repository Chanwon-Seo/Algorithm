import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] xy;
    static int[] member;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        member = new int[N];
        xy = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) cnt++;
            }
            member[i] = cnt;
        }

        for (int i = 0; i < N; i++) {
            sb.append(member[i]).append(" ");
        }

        System.out.print(sb);
    }

}
