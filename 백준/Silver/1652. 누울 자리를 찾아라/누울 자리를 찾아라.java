import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                if (input.charAt(j) == '.') {
                    map[i][j] = true;
                }
            }
        }
        
        int wcount = 0;
        int hcount = 0;
        for (int i = 0; i < n; i++) {
            int wc = 0;
            int hc = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j]) {
                    wc++;
                    if (wc == 2) {
                        wcount++;
                    }
                } else {
                    wc = 0;
                }
                if (map[j][i]) {
                    hc++;
                    if (hc == 2) {
                        hcount++;
                    }
                } else {
                    hc = 0;
                }
            }
        }

        sb.append(wcount).append(" ").append(hcount);
        System.out.print(sb);
    }
}