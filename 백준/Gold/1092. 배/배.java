import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> crane = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) crane.add(Integer.parseInt(st.nextToken()));

        int m = Integer.parseInt(br.readLine());
        List<Integer> box = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) box.add(Integer.parseInt(st.nextToken()));

        crane.sort(Collections.reverseOrder());
        box.sort(Collections.reverseOrder());

        if (crane.get(0) < box.get(0)) {
            System.out.println(-1);
            return;
        }

        int day = 0;
        while (!box.isEmpty()) {
            int boxIdx = 0, craneIdx = 0;

            while (craneIdx < n) {
                if (boxIdx == box.size()) {
                    break;
                } else if (crane.get(craneIdx) >= box.get(boxIdx)) {
                    box.remove(boxIdx);
                    craneIdx++;
                } else {
                    boxIdx++;
                }
            }
            day++;
        }

        System.out.print(day);
    }
}