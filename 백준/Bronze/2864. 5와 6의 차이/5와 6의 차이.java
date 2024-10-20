import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        A = A.replace('6', '5');
        B = B.replace('6', '5');
        sb.append(Integer.parseInt(A) + Integer.parseInt(B)).append(" ");

        A = A.replace('5', '6');
        B = B.replace('5', '6');
        sb.append(Integer.parseInt(A) + Integer.parseInt(B));

        System.out.print(sb);
    }
}