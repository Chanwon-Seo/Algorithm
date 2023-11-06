package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (hash.get(num) == null) {
                hash.put(num, 1);
            } else {
                hash.put(num, hash.get(num) + 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (hash.get(num) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(hash.get(num)).append(" ");
            }
        }
        System.out.println(sb);
    }

}
