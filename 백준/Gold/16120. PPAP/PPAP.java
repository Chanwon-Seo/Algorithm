import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	static String PPAP = "PPAP";
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stack.add(ch);

			if (stack.size() >= 4) {
				String tmp = "";
				for (int j = 0; j < 4; j++)
					tmp = stack.pop() + tmp;

				if (tmp.equals(PPAP)) {
					stack.add('P');
				} else {
					for (int j = 0; j < 4; j++) {
						stack.add(tmp.charAt(j));
					}
				}
			}
		}

		if (stack.size() == 1 && stack.peek() == 'P') {
			System.out.println("PPAP");
		} else {
			System.out.println("NP");
		}
	}
}