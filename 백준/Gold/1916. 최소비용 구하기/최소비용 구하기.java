import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
	int end;
	int weight;

	Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}

}

public class Main {
	static int N, M;
	static ArrayList<ArrayList<Node>> list;
	static int[] map;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		list = new ArrayList<>();
		map = new int[N + 1];
		visited = new boolean[N + 1];

		Arrays.fill(map, Integer.MAX_VALUE);

		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			list.get(start).add(new Node(end, weight));
		}

		st = new StringTokenizer(br.readLine());
		int startPos = Integer.parseInt(st.nextToken());
		int endPos = Integer.parseInt(st.nextToken());

		System.out.println(dijkstra(startPos, endPos));
	}

	static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] check = new boolean[N + 1];
		pq.offer(new Node(start, 0));
		map[start] = 0;

		while (!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.end;

			if (!check[cur]) {
				check[cur] = true;

				for (Node node : list.get(cur)) {
					if (!check[node.end] && map[node.end] > map[cur] + node.weight) {
						map[node.end] = map[cur] + node.weight;
						pq.add(new Node(node.end, map[node.end]));
					}
				}
			}
		}
		return map[end];
	}
}
