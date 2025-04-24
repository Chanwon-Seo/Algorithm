import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(in.readLine());

        String[] students = new String[N];
        for (int i = 0; i < N; i++) students[i] = in.readLine();

        int len = students[0].length();
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < N; j++) {
                set.add(students[j].substring(len - i));
            }

            if (set.size() == N) {
                System.out.println(i);
                return;
            }
            set.clear();
        }
    }
}