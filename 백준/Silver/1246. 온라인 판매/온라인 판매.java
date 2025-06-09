import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> client = new ArrayList<>();
        for (int i = 0; i < m; i++) client.add(Integer.parseInt(br.readLine()));

        int sum = 0;
        int max = 0;
        Collections.sort(client);

        for (int i = 0; i < client.size(); i++) {
            int nowPi = client.get(i);
            int nowsum = 0;

            if (m - i < n) nowsum = nowPi * (m - i);
            else nowsum = nowPi * n;

            if (nowsum > sum) {
                sum = nowsum;
                max = nowPi;
            }
        }
        System.out.println(max + " " + sum);
    }
}