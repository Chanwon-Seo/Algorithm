import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        if (T % 4 == 0 && (T % 100 != 0 || T % 400 == 0)) {
            sb.append("1");
        } else {
            sb.append("0");
        }
        System.out.println(sb);
    }
}
