import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr = {'U', 'C', 'P', 'C'};
        int idx = 0;

        for (int i = 0; i < input.length(); i++) {
            if (arr[idx] == input.charAt(i)) idx++;

            if (idx == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        
        System.out.println("I hate UCPC");
    }
}