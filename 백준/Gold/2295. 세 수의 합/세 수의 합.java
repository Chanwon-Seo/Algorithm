import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] numbers = new int[n];

		while (n-- > 0) {
			numbers[n] = Integer.parseInt(br.readLine());
		}

		int[] twoValuesSum = new int[(numbers.length * (numbers.length + 1)) / 2];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				twoValuesSum[count++] = numbers[i] + numbers[j];
			}
		}
		Arrays.sort(twoValuesSum);

		int answer = -1;
		for (int number : numbers) {
			for (int i : numbers) {
				if (binarySearch(twoValuesSum, number - i)) {
					answer = Math.max(answer, number);
				}
			}
		}
		System.out.println(answer);
	}

	private static boolean binarySearch(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] > value) {
				r = m - 1;
			} else if (arr[m] < value) {
				l = m + 1;
			} else{
				return true;
			}
		}
		return false;
	}

}
