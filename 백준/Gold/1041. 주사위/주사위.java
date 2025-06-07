import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            num = Math.min(arr[i], num);
        }

        if (n == 1) {
            Arrays.sort(arr);
            int answer = 0;

            for (int i = 0; i < 5; i++) answer += arr[i];
            System.out.println(answer);
        } else {

            long three = 4;
            long two = 4L * (n - 1) + (n - 2) * 4L;
            long one = (long) n * n * 5 - (three * 3 + two * 2);

            int threeNum = Math.min(arr[0], arr[5]) +
                    Math.min(arr[1], arr[4]) + Math.min(arr[2], arr[3]);
            int twoNum = Integer.MAX_VALUE;

            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (i + j != 5)
                        twoNum = Math.min(twoNum, arr[i] + arr[j]);
                }
            }

            long answer = one * num + two * twoNum + three * threeNum;
            System.out.println(answer);
        }
    }
}