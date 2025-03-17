import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        TreeSet<Integer> treeSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < B; j++) {
            int bNum = Integer.parseInt(st.nextToken());
            treeSet.remove(bNum);
        }


        StringBuilder sb = new StringBuilder();

        sb.append(treeSet.size()).append("\n");
        for (Integer num : treeSet) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
