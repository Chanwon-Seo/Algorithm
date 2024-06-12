package backjoon;

import java.io.*;
import java.util.*;

public class boj_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }

        int flagI = 0;
        int flagJ = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (sum - arr[i] - arr[j] == 100) {
                        flagI = i;
                        flagJ = j;
                        break;
                    }
                }
            }
        }
        arr[flagI] = 0;
        arr[flagJ] = 0;
        
        System.out.println("adsf");
        Arrays.sort(arr);
        for (int z = 2; z < arr.length; z++) {
            System.out.println(arr[z]);
        }

    }
}