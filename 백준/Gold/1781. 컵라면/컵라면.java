import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Raman implements Comparable<Raman> {
    int dead;
    int count;

    public Raman(int dead, int count) {
        this.dead = dead;
        this.count = count;
    }

    public int compareTo(Raman o) {
        if (dead == o.dead) {
            return o.count - count;
        } else {
            return dead - o.dead;
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        ArrayList<Raman> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dead = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            arr.add(new Raman(dead, count));
        }

        Collections.sort(arr);
        for (int i = 0; i < N; i++) {
            int dead = arr.get(i).dead;
            int count = arr.get(i).count;
            q.add(count);
            if (dead < q.size()) {
                q.poll();
            }
        }
        long result = 0;
        while (!q.isEmpty()) result += q.poll();
        
        System.out.println(result);
    }
}