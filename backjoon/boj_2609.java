package backjoon;

import java.io.*;
import java.util.*;

public class boj_2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int num = A * B;
        
        while (B != 0) {
            A = A % B;
            int temp = A;
            A = B;
            B = temp;
        }
        System.out.println(A + "\n" + num / A);
    }
}