import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] parent;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        parent = new int[g + 1];
        for (int i = 1; i <= g; i++) parent[i] = i;

        int ans = 0;
        for (int i = 0; i < P; i++) {
            int input = Integer.parseInt(br.readLine());
            int emptyGate = search(input);

            if (emptyGate == 0) break;

            ans++;
            union(emptyGate, emptyGate - 1);
        }

        System.out.println(ans);
    }

    static void union(int x, int y) {
        x = search(x);
        y = search(y);
        if (x != y) parent[x] = y;
    }

    static int search(int x) {
        if (x == parent[x]) return x;
        return parent[x] = search(parent[x]);
    }


}