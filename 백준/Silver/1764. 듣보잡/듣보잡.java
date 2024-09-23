import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> userMap = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            String userName = br.readLine();
            userMap.put(userName, userMap.getOrDefault(userName, 0) + 1);
        }
        ArrayList<String> duplicatedUserList = new ArrayList<>();

        for (Map.Entry<String, Integer> value : userMap.entrySet()) {
            if (value.getValue() > 1) {
                duplicatedUserList.add(value.getKey());
            }
        }
        Collections.sort(duplicatedUserList);
        sb.append(duplicatedUserList.size()).append("\n");
        for (String duplicatedUserName : duplicatedUserList) {
            sb.append(duplicatedUserName).append("\n");
        }
        System.out.println(sb);
    }

}