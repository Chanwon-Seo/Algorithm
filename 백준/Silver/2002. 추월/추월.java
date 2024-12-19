import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        LinkedList<String> inList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            inList.add(br.readLine());
        }

        LinkedList<String> outList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            outList.add(br.readLine());
        }
        int ans = 0;
        while (!outList.isEmpty()) {
            String number = outList.poll();
            if (!number.equals(inList.peek())) {
                ans++;
                inList.remove(number);
            } else {
                inList.poll();
            }
        }
        System.out.println(ans);
    }
}