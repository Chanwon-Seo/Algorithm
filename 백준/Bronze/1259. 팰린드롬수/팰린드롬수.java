import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();

        while (true) {
            String T = br.readLine();
            if (T.equals("0")) {
                break;
            }
            StringBuffer sb = new StringBuffer(T);
            boolean b = T.equals(sb.reverse().toString());

            if (b) {
                stb.append("yes\n");
            } else {
                stb.append("no\n");
            }
        }
        System.out.println(stb);
    }
}