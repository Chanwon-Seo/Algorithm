import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }

        Set<Integer> num = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            findCombinations(n, i, 0, 0, num);
        }

        // 결과 출력
        System.out.println(totalSum - num.size());
    }

    // 조합을 구하고 그 합을 Set에 저장하는 재귀 메서드
    private static void findCombinations(int n, int r, int index, int currentSum, Set<Integer> num) {
        if (r == 0) {
            num.add(currentSum);
            return;
        }
        if (index == n) {
            return;
        }

        findCombinations(n, r - 1, index + 1, currentSum + arr[index], num);
        findCombinations(n, r, index + 1, currentSum, num);
    }
}
