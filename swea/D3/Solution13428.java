package swea;

import java.io.*;

public class Solution13428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int Ti = 0; Ti < T; Ti++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int min = Integer.parseInt(str);
            int max = Integer.parseInt(str);
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    char tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;

                    int num = Integer.parseInt(String.valueOf(arr));
                    if (arr[0] != '0' && min > num) {
                        min = num;
                    }
                    if (arr[0] != '0' && max < num) {
                        max = num;
                    }
                    arr = str.toCharArray();
                }
            }
            sb.append(String.format("#%d %d %d\n", Ti + 1, min, max));
        }
        System.out.println(sb);
    }
}