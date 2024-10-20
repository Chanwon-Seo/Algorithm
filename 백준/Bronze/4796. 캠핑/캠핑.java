import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = "";
        int i = 1;
        while (!(input = br.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(input);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int total = L * (V / P) + Math.min(L, V % P);
            sb.append("Case ").append(i).append(": ").append(total).append("\n");
            i++;
        }

        System.out.print(sb);
    }
}