import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String balls = br.readLine();

        int minMoves = Integer.MAX_VALUE;

        minMoves = Math.min(minMoves, countMoves(balls, 'R', 'B', false));
        minMoves = Math.min(minMoves, countMoves(balls, 'B', 'R', false));
        minMoves = Math.min(minMoves, countMoves(balls, 'R', 'B', true));
        minMoves = Math.min(minMoves, countMoves(balls, 'B', 'R', true));

        System.out.println(minMoves);
    }

    static int countMoves(String balls, char targetChar, char otherChar, boolean reverse) {
        int count = 0;
        boolean foundOther = false;

        if (reverse) {
            for (int i = balls.length() - 1; i >= 0; i--) {
                if (balls.charAt(i) == otherChar) {
                    foundOther = true;
                } else if (foundOther && balls.charAt(i) == targetChar) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < balls.length(); i++) {
                if (balls.charAt(i) == otherChar) {
                    foundOther = true;
                } else if (foundOther && balls.charAt(i) == targetChar) {
                    count++;
                }
            }
        }
        return count;
    }
}