import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int x = Integer.parseInt(br.readLine());
        int squareCount = 1;
        int squareSum = 0;

        while (true) {
            if (x <= squareSum + squareCount) {
                if (squareCount % 2 == 1) {
                    System.out.println((squareCount - (x - squareSum - 1) + "/" + (x - squareSum)));
                } else {
                    System.out.println((x - squareSum) + "/" + (squareCount - (x - squareSum - 1)));
                }
                break;
            } else {
                squareSum += squareCount;
                squareCount++;
            }
        }

    }
}