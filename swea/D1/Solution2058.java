import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] N = br.readLine().split("");

        int sum = 0;
        for (int i = 0; i < N.length; i++) {
            sum += Integer.parseInt(N[i]);
        }

        System.out.println(sum);
    }

}