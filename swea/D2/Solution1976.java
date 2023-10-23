import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());
            time += Integer.parseInt(st.nextToken());
            min += Integer.parseInt(st.nextToken());

            if (min > 59) {
                min = min % 60;
                time++;
                if (time > 12) {
                    time = time - 12;
                }
                sb.append(String.format("#%d %d %d\n", i + 1, time, min));
            } else {
                if (time > 12) {
                    time = time - 12;
                }
                sb.append(String.format("#%d %d %d\n", i + 1, time, min));
            }
        }
        System.out.println(sb);
    }
}
