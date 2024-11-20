import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(list);
        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}