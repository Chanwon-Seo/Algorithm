import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static HashMap<String, Integer> hash;

	public static void main(String[] args) throws Exception {

		hash = new HashMap<>();

		hash.put("I", 1);
		hash.put("IV", 4);
		hash.put("V", 5);
		hash.put("IX", 9);
		hash.put("X", 10);
		hash.put("XL", 40);
		hash.put("L", 50);
		hash.put("XC", 90);
		hash.put("C", 100);
		hash.put("CD", 400);
		hash.put("D", 500);
		hash.put("CM", 900);
		hash.put("M", 1000);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] a = br.readLine().split("");
		String[] b = br.readLine().split("");

		int sum = getNum(a) + getNum(b);
		String ans = getRoma(sum);
		System.out.println(sum);
		System.out.println(ans);

	}

	static int getNum(String[] num) {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			char tmp = num[i].charAt(0);
			if ((tmp == 'I' || tmp == 'X' || tmp == 'C') && i < num.length - 1) {
				String s = num[i] + num[i + 1];
				if (hash.containsKey(s)) {
					sum += hash.get(s);
					i++;
					continue;
				}
			}
			sum += hash.get(num[i]);
		}
		return sum;
	}

	static String getRoma(int num) {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hash.entrySet());
		list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
		String ans = "";
		while (num > 0) {
			int tmp = 0;
			for (Map.Entry<String, Integer> entry : list) {
				tmp = num / entry.getValue();
				for (int i = 0; i < tmp; i++) {
					ans += entry.getKey();
				}
				num = num % entry.getValue();
			}
		}
		return ans;
	}
}