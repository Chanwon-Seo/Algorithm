import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        TreeSet<Integer> tSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            tSet.add(Integer.parseInt(st.nextToken()));
        }

        for (int i : tSet) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}