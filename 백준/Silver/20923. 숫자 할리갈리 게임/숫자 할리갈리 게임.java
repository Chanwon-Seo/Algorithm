import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static final String DO = "do", SU = "su", DRAW = "dosu";
    static final int WIN_NUMBER = 5;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> doCards = new LinkedList<>();
        Deque<Integer> suCards = new LinkedList<>();
        Deque<Integer> doGround = new LinkedList<>();
        Deque<Integer> suGround = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            doCards.offerFirst(Integer.valueOf(st.nextToken()));
            suCards.offerFirst(Integer.valueOf(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                doGround.offerLast(doCards.pollFirst());
            } else {
                suGround.offerLast(suCards.pollFirst());
            }

            if (doCards.isEmpty() || suCards.isEmpty()) break;

            if (!doGround.isEmpty() && doGround.peekLast() == WIN_NUMBER ||
                    !suGround.isEmpty() && suGround.peekLast() == WIN_NUMBER) {
                collectCards(doCards, doGround, suGround);
            }

            if (!doGround.isEmpty() && !suGround.isEmpty()
                    && doGround.peekLast() + suGround.peekLast() == WIN_NUMBER) {
                collectCards(suCards, suGround, doGround);
            }
        }

        String winner = DRAW;
        if (doCards.size() > suCards.size()) winner = DO;
        else if (doCards.size() < suCards.size()) winner = SU;

        System.out.println(winner);
    }

    static void collectCards(Deque<Integer> winnerCards, Deque<Integer> winnerGround, Deque<Integer> loserGround) {
        winnerCards.addAll(loserGround);
        winnerCards.addAll(winnerGround);
        loserGround.clear();
        winnerGround.clear();
    }
}