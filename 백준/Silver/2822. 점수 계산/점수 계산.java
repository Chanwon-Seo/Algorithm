import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int[][] arr = new int[8][2];
		int[] result = new int[5];
		int answer = 0;

		for (int i = 0; i < 8; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i;
		}

		Arrays.sort(arr, (o1, o2) -> Integer.compare(o2[0], o1[0]));

		for (int i = 0; i < 5; i++) {
			answer += arr[i][0];
			result[i] = arr[i][1] + 1;
		}

		Arrays.sort(result);

		sb.append(answer).append("\n");
		for (int i = 0; i < 5; i++) {
			sb.append(result[i]).append(" ");
		}

		System.out.print(sb);
	}
}
