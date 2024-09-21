import java.io.*;

public class Solution2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int strMM = Integer.parseInt(str.substring(4, 6));
            int strDD = Integer.parseInt(str.substring(6));
            sb.append("#").append(i + 1).append(" ");
            switch (strMM) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (strDD >= 1 && strDD <= 31) {
                        sb.append(str.substring(0,4)).append("/").append(str.substring(4, 6)).append("/")
                                .append(str.substring(6));
                    } else {
                        sb.append(-1);
                    }
                    break;
                case 2:
                    if (strDD >= 1 && strDD <= 28) {
                        sb.append(str.substring(0,4)).append("/").append(str.substring(4, 6)).append("/")
                                .append(str.substring(6));
                    } else {
                        sb.append(-1);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (strDD >= 1 && strDD <= 30) {
                        sb.append(str.substring(0,4)).append("/").append(str.substring(4, 6)).append("/")
                                .append(str.substring(6));
                    } else {
                        sb.append(-1);
                    }
                    break;
                default:
                    sb.append(-1);
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}