import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        HashSet<String> enterMember = new HashSet();
        int ans = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if ("ENTER".equals(input)) {
                ans += enterMember.size();
                enterMember.clear();
                continue;
            }
            enterMember.add(input);
        }
        ans += enterMember.size();
        System.out.println(ans);
    }
}