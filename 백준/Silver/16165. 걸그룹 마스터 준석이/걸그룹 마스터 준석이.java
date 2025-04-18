import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, String[]> teamName = new HashMap<>();
        HashMap<String, String> memberName = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            String groupName = br.readLine();
            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            while (k-- > 0) {
                String inputMemberName = br.readLine();
                memberName.put(inputMemberName, groupName);
                arr[k] = inputMemberName;
            }
            Arrays.sort(arr);
            teamName.put(groupName, arr);
        }

        while (m-- > 0) {
            String input = br.readLine();
            int num = Integer.parseInt(br.readLine());
            switch (num) {
                case 0:
                    for (String s : teamName.get(input))
                        sb.append(s).append("\n");
                    break;
                case 1:
                    sb.append(memberName.get(input)).append("\n");
            }
        }
        System.out.print(sb);
    }
}