import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(sum == 4 ? "E\n" : sum == 3 ? "A\n" : sum == 2 ? "B\n" : sum == 1 ? "C\n" : "D\n");
        }

        System.out.println(sb);

    }
}