import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();

        for (int i = 1; i <= Integer.parseInt(N); i++) {
            String str = String.valueOf(i);
            int clap = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                int num = Integer.parseInt(String.valueOf(ch));
                if (num >= 3 && num % 3 == 0) {
                    clap++;
                }

            }
            if (clap > 0) {
                str = "";
                for (int z = 0; z < clap; z++) {
                    str += "-";
                }
            }
            sb.append(str).append(" ");
        }
        System.out.print(sb);
    }
}