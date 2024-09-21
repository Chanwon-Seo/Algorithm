import java.io.*;

public class Solution2027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i == j) {
                    System.out.print("#");
                    continue;
                }
                System.out.print("+");
            }
            System.out.println();
        }
    }
}