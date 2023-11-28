package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arrN;

    static int solution(int findNum) {
        int start = 0;
        int mid = 0;
        int end = arrN.length - 1;

        int check = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arrN[mid] == findNum) {
                check = 1;
            }

            // mid가 크다
            if (arrN[mid] > findNum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return check;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        arrN = new int[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(solution(Integer.parseInt(st.nextToken()))).append(" ");
        }

        System.out.println(sb);

    }

}