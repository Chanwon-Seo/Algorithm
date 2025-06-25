import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) * 2;

        int[] member = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) member[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(member);
        int min = 200000;
        for (int i = 0; i < num / 2; i++) {
            int teamScore = member[i] + member[num - 1 - i];
            if (teamScore < min) min = teamScore;
        }
        System.out.print(min);
    }
}