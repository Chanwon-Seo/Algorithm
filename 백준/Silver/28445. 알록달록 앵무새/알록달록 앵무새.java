import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
            list.add(st.nextToken());
        }

        Collections.sort(list);
        TreeSet<String> set = new TreeSet<>();
        for (String s1 : list) {
            for (String s2 : list) {
                StringBuilder sb = new StringBuilder();
                set.add(sb.append(s1).append(" ").append(s2).toString());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}