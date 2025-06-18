import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int idx = 0;
        int base = 0;
        while (base++ <= 30000) {
            String temp = String.valueOf(base);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == input.charAt(idx)) {
                    idx++;
                }

                if (idx == input.length()) {
                    System.out.println(base);
                    return;
                }
            }
        }
    }
}