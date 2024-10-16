import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;

    static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Node head = new Node('A', null, null);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            insert(head, root, left, right);
        }
        preOrder(head);
        sb.append("\n");
        inOrder(head);
        sb.append("\n");
        postOrder(head);
        System.out.print(sb);

    }

    static void insert(Node head, char root, char left, char right) {
        if (head.value == root) {
            head.left = (left == '.' ? null : new Node(left, null, null));
            head.right = (right == '.' ? null : new Node(right, null, null));
        } else {
            if (head.left != null) insert(head.left, root, left, right);
            if (head.right != null) insert(head.right, root, left, right);
        }
    }

    static void preOrder(Node node) {
        if (node == null) return;
        sb.append(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        sb.append(node.value);
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        sb.append(node.value);
    }
}