import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(N >= 90 ? 'A' : N >= 80 ? 'B' : N >= 70 ? 'C' : N >= 60 ? 'D' : 'F');
    }
}
