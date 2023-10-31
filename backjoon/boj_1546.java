package backjoon;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[N];

        double max = 0;
        for (int i = 0; i < N; i++) {
            double num = Double.parseDouble(st.nextToken());
            if (max < num) {
                max = num;
            }
            arr[i] = num;
        }
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += (arr[i] / max) * 100;
        }

        System.out.println(sum / N);
    }
}