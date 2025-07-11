import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int sx = Integer.parseInt(st.nextToken());
		int sy = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int cx = Integer.parseInt(st.nextToken());
		int cy = Integer.parseInt(st.nextToken());
		int dx = Integer.parseInt(st.nextToken());
		int dy = Integer.parseInt(st.nextToken());
		int gcd = gcd(Math.min(dx, dy), Math.max(dx, dy));

		dx /= gcd;
		dy /= gcd;

		int minDistance = (sx - cx) * (sx - cx) + (sy - cy) * (sy - cy);
		int[] result = new int[2];
		result[0] = cx;
		result[1] = cy;

		while (true) {
			int nx = cx + dx;
			int ny = cy + dy;

			int distance = (sx - nx) * (sx - nx) + (sy - ny) * (sy - ny);

			if (distance >= minDistance) {
				break;
			}

			minDistance = distance;
			result[0] = nx;
			result[1] = ny;
			cx = nx;
			cy = ny;
		}

		System.out.printf("%d %d", result[0], result[1]);
	}

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
}