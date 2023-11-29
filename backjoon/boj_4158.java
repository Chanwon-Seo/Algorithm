package backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = null;

        while (true) {
            String str = br.readLine();
            if (str.equals("0 0")) {
                break;
            } else {
                st = new StringTokenizer(str);
                map = new HashMap<>();

                while (st.hasMoreTokens()) {
                    int stNum = Integer.parseInt(st.nextToken());
                    for (int i = 0; i < stNum; i++) {
                        int num = Integer.parseInt(br.readLine());
                        map.put(num, map.getOrDefault(num, 0) + 1);
                    }
                }

                int count = 0;
                for (Integer i : map.values()) {
                    if (i == 2) {
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }
        }
        System.out.println(sb);

    }
}