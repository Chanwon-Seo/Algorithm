import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringTokenizer stZero = new StringTokenizer(S, "0");
        StringTokenizer stOne = new StringTokenizer(S, "1");
        System.out.println(Math.min(stZero.countTokens(), stOne.countTokens()));
    }

}
