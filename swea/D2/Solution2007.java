import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        String[] str_arr = null;

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            str_arr = new String[str.length() + 1];
            str_arr = str.split("");

            String resultText = str_arr[0];
            String temp = "";
            for (int j = 1; j < str_arr.length - 1; j++) {

                if (String.valueOf(resultText.charAt(0)).equals(str_arr[j])) {
                    String[] stringCopy = Arrays.copyOfRange(str_arr, j, j + resultText.length());

                    String checkResultText1 = String.join("", resultText);
                    String checkResultText2 = String.join("", stringCopy);

                    if (checkResultText1.equals(checkResultText2)) {
                        break;
                    }
                }

                if (!temp.equals(str_arr[j])) {
                    resultText += str_arr[j];
                }
            }

            sb.append(String.format("#%d %d\n", i + 1, resultText.length()));
        }

        System.out.println(sb);
    }
}