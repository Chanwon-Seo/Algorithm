import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n, d = 0;
	static int[][] map;
	static Map<Integer, String> moveMap;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		map = new int[n][n];
		moveMap = new HashMap<>();
		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			map[a][b] = 1;
		}

		int l = Integer.parseInt(br.readLine());
		for (int i = 0; i < l; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			String direction = st.nextToken();
			moveMap.put(time, direction);
		}

		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		int time = 0;
		int px = 0;
		int py = 0;

		while (true) {
			int nx = px + dx[d];
			int ny = py + dy[d];
			time++;

			if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) {
				break;
			}

			if (q.contains(ny * n + nx)) {
				break;
			}

			if (map[ny][nx] == 1) {
				map[ny][nx] = 0;
				q.add(ny * n + nx);
			} else {
				q.add(ny * n + nx);
				q.poll();
			}

			if (moveMap.containsKey(time)) {
				String data = moveMap.get(time);
				if (data.equals("D")) {
					d += 1;
					if (d == 4)
						d = 0;
				} else {
					d -= 1;
					if (d == -1)
						d = 3;
				}
			}
			px = nx;
			py = ny;
		}
		System.out.println(time);
	}
}

