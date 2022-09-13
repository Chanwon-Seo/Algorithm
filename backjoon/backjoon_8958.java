package backjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        String[] str_arr = new String[N];

        for (int i = 0; i < str_arr.length; i++) {
            str_arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            int sum = 0;

            for (int j = 0; j < str_arr[i].length(); j++) {

                if (str_arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}