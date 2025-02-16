import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> students = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            students.add(i - Integer.parseInt(st.nextToken()), i + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(students.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}