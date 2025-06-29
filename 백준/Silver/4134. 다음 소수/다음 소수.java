import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			BigInteger primeNumber = new BigInteger(String.valueOf(Long.parseLong(br.readLine())));

			if (primeNumber.isProbablePrime(10)) {
				sb.append(primeNumber);
			} else {
				sb.append(primeNumber.nextProbablePrime());
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}