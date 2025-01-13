import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[988];

        for (int i = 123; i <= 987; i++) {
            String num = String.valueOf(i);

            if (num.charAt(0) == '0' || num.charAt(1) == '0' || num.charAt(2) == '0') continue;
            if (num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2))
                continue;
            check[i] = true;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int a = 123; a <= 987; a++) {
                if (check[a]) {

                    int sn = 0;
                    int bn = 0;

                    for (int one = 0; one < 3; one++) {
                        char num_split = Integer.toString(num).charAt(one);

                        for (int two = 0; two < 3; two++) {
                            char a_split = Integer.toString(a).charAt(two);

                            if (num_split == a_split && one == two) sn++;
                            else if (num_split == a_split && one != two) bn++;
                        }
                    }

                    check[a] = sn == s && bn == b;
                }
            }
        }

        int a = 0;
        for (int i = 123; i <= 987; i++) {
            if (check[i]) a++;
        }
        System.out.println(a);
    }
}