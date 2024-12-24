import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String userA, userB;

        HashSet<String> userSet = new HashSet<>();
        userSet.add("ChongChong");

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            userA = st.nextToken();
            userB = st.nextToken();
            if (userSet.contains(userA) || userSet.contains(userB)) {
                userSet.add(userA);
                userSet.add(userB);
            }
        }
        System.out.println(userSet.size());
    }
}