import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int cer = Integer.parseInt(st.nextToken());

        int[][] arr = new int[num + 1][4];
        int rank = 1;

        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            arr[index][0] = first;
            arr[index][1] = second;
            arr[index][2] = third;
        }

        for (int i = 1; i <= num; i++) {
            if (arr[i][0] > arr[cer][0]) {
                rank++;
            } else if (arr[i][0] == arr[cer][0] && arr[i][1] > arr[cer][1]) {
                rank++;
            } else if (arr[i][0] == arr[cer][0] && arr[i][1] == arr[cer][1] && arr[i][2] > arr[cer][2]) {
                rank++;
            }
        }
        System.out.println(rank);
    }
}