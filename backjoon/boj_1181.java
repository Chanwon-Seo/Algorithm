package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < N - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                arr[i] = "";
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                sb.append(String.format("%s\n", arr[i]));
            }
        }

        System.out.println(sb);
    }
}