import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int x, y, time;

		Node(int x, int y, int time) {
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}

	static int N, M;
	static int[][] arr;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static List<Node> nodes = new ArrayList<>();
	static Node[] active;
	static int resultMinTime = Integer.MAX_VALUE;
	static int originEmptySpace = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N][N];
		active = new Node[M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());

				if (arr[i][j] == 0) {
					originEmptySpace++;
				} else if (arr[i][j] == 2) {
					nodes.add(new Node(i, j, 0));
				}
			}
		}

		if (originEmptySpace == 0) {
			System.out.println(0);
		} else {
			selectVirus(0, 0);
			System.out.println(resultMinTime == Integer.MAX_VALUE ? -1 : resultMinTime);
		}
	}

	static void selectVirus(int start, int selectCount) {
		if (selectCount == M) {
			spreadVirus(originEmptySpace);
			return;
		}

		for (int i = start; i < nodes.size(); i++) {
			active[selectCount] = nodes.get(i);
			selectVirus(i + 1, selectCount + 1);
		}
	}

	static void spreadVirus(int emptySpace) {
		Queue<Node> q = new LinkedList<>();
		boolean[][] infected = new boolean[N][N];

		for (int i = 0; i < M; i++) {
			Node node = active[i];
			infected[node.x][node.y] = true;
			q.add(node);
		}

		while (!q.isEmpty()) {
			Node node = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];

				if (nx < 0 || nx >= N || ny < 0 || ny >= N)
					continue;
				if (infected[nx][ny] || arr[nx][ny] == 1)
					continue;

				if (arr[nx][ny] == 0) {
					emptySpace--;
				}

				if (emptySpace == 0) {
					resultMinTime = Math.min(resultMinTime, node.time + 1);
					return;
				}

				infected[nx][ny] = true;
				q.add(new Node(nx, ny, node.time + 1));
			}
		}
	}
}
