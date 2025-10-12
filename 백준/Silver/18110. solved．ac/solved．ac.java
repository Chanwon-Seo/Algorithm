import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);

		int delete = (int)Math.round(n * 0.15);

		int sum = 0;
		for (int i = delete; i < n - delete; i++) {
			sum += list.get(i);
		}

		double avg = (double)sum / (n - (delete * 2));
		System.out.println(Math.round(avg));
	}
}