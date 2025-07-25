import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tree implements Comparable<Tree> {
	int x, y, age;

	public Tree(int x, int y, int age) {
		super();
		this.x = x;
		this.y = y;
		this.age = age;
	}

	@Override
	public int compareTo(Tree o) {
		return this.age - o.age;
	}
}

public class Main {
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] A = new int[N + 1][N + 1];
		int[][] eat = new int[N + 1][N + 1];
		Deque<Tree> trees = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
				eat[i][j] = 5;
			}
		}

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int tree_age = Integer.parseInt(st.nextToken());
			trees.add(new Tree(x, y, tree_age));
		}

		while (K > 0) {
			Queue<Tree> die_tree_list = new LinkedList<>();

			for (int i = 0; i < trees.size(); ) {
				Tree cur = trees.poll();
				if (eat[cur.x][cur.y] >= cur.age) {
					eat[cur.x][cur.y] -= cur.age;
					cur.age++;
					i++;
					trees.add(cur);
				} else {
					die_tree_list.add(cur);
				}
			}

			for (Tree t : die_tree_list) {
				eat[t.x][t.y] += t.age / 2;
			}

			Queue<Tree> temp_list = new LinkedList<>();
			for (Tree t : trees) {
				if (t.age % 5 == 0) {
					temp_list.add(t);
				}
			}
			while (!temp_list.isEmpty()) {
				Tree t = temp_list.poll();

				for (int i = 0; i < 8; i++) {
					int next_x = t.x + dx[i];
					int next_y = t.y + dy[i];
					if (next_x >= 1 && next_x <= N && next_y >= 1 && next_y <= N) {
						trees.addFirst(new Tree(next_x, next_y, 1));
					}
				}
			}

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					eat[i][j] += A[i][j];
				}
			}

			K--;
		}
		System.out.println(trees.size());
	}
}