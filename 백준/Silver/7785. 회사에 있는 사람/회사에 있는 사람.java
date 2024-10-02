import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<String> userSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String username = st.nextToken();
            String status = st.nextToken();
            if (userSet.contains(username)) {
                userSet.remove(username);
            } else {
                if ("enter".equals(status)) {
                    userSet.add(username);
                }
            }
        }
        List<String> list = userSet.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}