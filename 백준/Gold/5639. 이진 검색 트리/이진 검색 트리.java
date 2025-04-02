import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Node rootNode = new Node(Integer.parseInt(br.readLine()));
        String input;
        while ((input = br.readLine()) != null) {
            rootNode.insert(Integer.parseInt(input));
        }
        postOrder(rootNode);
        System.out.print(sb);
    }

    static void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.leftNode);
        postOrder(node.rightNode);
        sb.append(node.value).append("\n");
    }

    static class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        void insert(int n) {
            if (n < this.value) {
                if (this.leftNode == null) this.leftNode = new Node(n);
                else this.leftNode.insert(n);
            } else {
                if (this.rightNode == null) this.rightNode = new Node(n);
                else this.rightNode.insert(n);
            }
        }
    }
}