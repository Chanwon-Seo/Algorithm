import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[(T - 1) / 2]);
    }

}