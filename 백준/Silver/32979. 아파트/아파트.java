import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) * 2;
        int t = Integer.parseInt(br.readLine());

        LinkedList<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) q.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int b = Integer.parseInt(st.nextToken());
            while (b-- > 1) q.offer(q.pop());
            sb.append(q.peek()).append(" ");
        }
        
        System.out.print(sb);
    }
}