import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        int start, end = 0;
        int max = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            end += arr[i];
            max = Math.max(max, arr[i]);
        }

        start = max;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (M >= search(mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

    static int search(int tempMoney) {
        int count = 1;
        int money = tempMoney;

        for (int num : arr) {
            money -= num;

            if (money < 0) {
                count++;
                money = tempMoney - num;
            }
        }
        
        return count;
    }
}