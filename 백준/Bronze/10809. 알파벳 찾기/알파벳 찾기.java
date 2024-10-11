import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static char[] input;
    static int[] visited = new int[26];

    public static void main(String[] args) throws IOException {
        input = br.readLine().toCharArray();

        Arrays.fill(visited, -1);
        int inputLength = input.length;
        for (int i = 0; i < inputLength; i++) {
            if (visited[input[i] - 97] == -1) {
                visited[input[i] - 97] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(visited[i]).append(" ");
        }
        System.out.println(sb);

    }
}
