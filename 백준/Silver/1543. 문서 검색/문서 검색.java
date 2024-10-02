import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String searchStr = br.readLine();
        int answer = 0;

        while (input.contains(searchStr)) {
            input = input.replaceFirst(searchStr, "_");
            answer++;
        }
        System.out.println(answer);

    }
}