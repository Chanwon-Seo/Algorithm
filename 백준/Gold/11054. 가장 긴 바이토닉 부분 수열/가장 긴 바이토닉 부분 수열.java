import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static Integer[] dpR;
	static Integer[] dpL;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new int[n];
		dpR = new Integer[n];
		dpL = new Integer[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			solutionR(i);
			solutionL(i);
		}

		int max = -1;

		for (int i = 0; i < n; i++) {
			max = Math.max(max, (dpR[i] + dpL[i] - 1));
		}

		System.out.println(max);

	}

	static int solutionR(int depth) {
		if (dpR[depth] == null) {
			dpR[depth] = 1;

			for (int i = depth - 1; i >= 0; i--) {
				if (arr[i] < arr[depth]) {
					dpR[depth] = Math.max(dpR[depth], solutionR(i) + 1);
				}
			}
		}
		return dpR[depth];
	}

	static int solutionL(int depth) {
		if (dpL[depth] == null) {
			dpL[depth] = 1;
			for (int i = depth + 1; i < dpL.length; i++) {
				if (arr[i] < arr[depth]) {
					dpL[depth] = Math.max(dpL[depth], solutionL(i) + 1);
				}
			}
		}
		return dpL[depth];
	}
}