import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] apt = new int[n];

            for (int j = 0; j < k + 1; j++) {
                if (j == 0) {
                    for (int z = 0; z < n; z++) {
                        apt[z] = z + 1;
                    }
                } else {
                    for (int z = 0; z < n; z++) {
                        if (z == 0) {
                            apt[z] = 1;
                        } else {
                            apt[z] = apt[z - 1] + apt[z];
                        }
                    }
                }
            }
            sb.append(apt[n - 1]).append("\n");
        }
        System.out.println(sb);
    }
}