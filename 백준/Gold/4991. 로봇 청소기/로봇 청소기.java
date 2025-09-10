import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int x, y, count;

		public Node(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}

	static char[][] map;
	static int startX, startY;
	static int[][] dust, width;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean[] visited;
	static int answer, dustIndex;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0)
				break;
			dustIndex = 2;
			map = new char[h][w];
			dust = new int[h][w];

			for (int i = 0; i < h; i++) {
				String str = br.readLine();
				for (int j = 0; j < w; j++) {
					map[i][j] = str.charAt(j);
					if (map[i][j] == 'o') {
						startX = j;
						startY = i;
						dust[i][j] = 1;
					} else if (map[i][j] == '*')
						dust[i][j] = dustIndex++;
				}
			}
			width = new int[dustIndex][dustIndex];
			visited = new boolean[dustIndex];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (dust[i][j] != 0) {
						dustRoute(h, w, j, i, dust[i][j]);
					}
				}
			}
			if (dustCheck()) {
				answer = Integer.MAX_VALUE;
				cal(1, 1, 0);
				System.out.println(answer);
			} else {
				System.out.println("-1");
			}
		}
	}

	static boolean dustCheck() {
		for (int i = 2; i < dustIndex; i++) {
			if (width[1][i] == 0) {
				return false;
			}
		}
		return true;
	}

	static void cal(int cur, int count, int value) {
		if (count == dustIndex - 1) {
			answer = Math.min(answer, value);
		}

		for (int i = 2; i < dustIndex; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			cal(i, count + 1, value + width[cur][i]);
			visited[i] = false;
		}
	}

	static void dustRoute(int h, int w, int x, int y, int index) {
		Queue<Node> queue = new LinkedList<>();
		boolean[][] visited = new boolean[h][w];
		visited[y][x] = true;
		queue.add(new Node(x, y, 0));
		while (!queue.isEmpty()) {
			Node n = queue.poll();

			for (int i = 0; i < 4; i++) {
				int tx = n.x + dx[i];
				int ty = n.y + dy[i];
				if (inRoom(tx, ty, h, w) && !visited[ty][tx]) {
					visited[ty][tx] = true;
					if (map[ty][tx] != 'x') {
						if (dust[ty][tx] != 0)
							width[index][dust[ty][tx]] = n.count + 1;
						queue.add(new Node(tx, ty, n.count + 1));
					}
				}
			}
		}
	}

	static boolean inRoom(int x, int y, int h, int w) {
		return x >= 0 && y >= 0 && x < w && y < h;
	}
}