import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] bingo;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        bingo = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                answer++;
                int num = Integer.parseInt(st.nextToken());

                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (bingo[x][y] == num) {
                            bingo[x][y] = 0;
                        }
                    }
                }

                rowCheck();
                columeCheck();
                lrCheck();
                rlCheck();

                if (count >= 3) {
                    System.out.println(answer);
                    return;
                }
                count = 0;
            }
        }
    }

    static void rowCheck() {
        for (int i = 0; i < 5; i++) {
            int rowCount = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0)
                    rowCount++;
            }
            if (bingoCheck(rowCount)) {
                count++;
            }
        }
    }

    static void columeCheck() {
        for (int i = 0; i < 5; i++) {
            int columeCount = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0)
                    columeCount++;
            }
            if (bingoCheck(columeCount)) {
                count++;
            }
        }
    }

    static void lrCheck() {
        int lrCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0)
                lrCount++;
        }
        if (bingoCheck(lrCount)) {
            count++;
        }
    }

    static void rlCheck() {
        int rlCount = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0)
                rlCount++;
        }
        if (bingoCheck(rlCount)) {
            count++;
        }
    }

    static boolean bingoCheck(int count) {
        return count == 5;
    }
}