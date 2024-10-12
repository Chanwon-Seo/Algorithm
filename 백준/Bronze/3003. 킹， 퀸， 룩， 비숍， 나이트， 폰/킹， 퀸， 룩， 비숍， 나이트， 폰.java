import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] pieceList = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int idx = 0;
        while (st.hasMoreTokens()) {
            sb.append(pieceList[idx] - Integer.parseInt(st.nextToken())).append(" ");
            idx++;
        }
        System.out.print(sb);
    }

}