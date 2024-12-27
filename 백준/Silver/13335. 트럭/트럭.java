import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Queue<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            trucks.add(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }

        int time = 0;
        int weightBridge = 0;
        while (!bridge.isEmpty()) {
            time++;
            weightBridge -= bridge.poll();

            if (trucks.isEmpty()) {
                continue;
            }

            if (trucks.peek() + weightBridge <= l) {
                int cur = trucks.poll();
                weightBridge += cur;
                bridge.add(cur);
            } else {
                bridge.add(0);
            }
        }
        System.out.print(time);
    }
}