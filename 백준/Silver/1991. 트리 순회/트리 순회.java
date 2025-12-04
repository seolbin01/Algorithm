import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node[] tree = new Node[26];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (tree[parent - 'A'] == null) {
                tree[parent - 'A'] = new Node(String.valueOf(parent));
            }

            if (left != '.') {
                tree[left - 'A'] = new Node(String.valueOf(left));
                tree[parent - 'A'].left = tree[left - 'A'];
            }

            if (right != '.') {
                tree[right - 'A'] = new Node(String.valueOf(right));
                tree[parent - 'A'].right = tree[right - 'A'];
            }
        }
        preOrder(tree[0]);
        System.out.println();
        inOrder(tree[0]);
        System.out.println();
        postOrder(tree[0]);
    }

    // 전위 순회 (root -> left -> right)
    public static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data);
            if (node.left != null) preOrder(node.left);
            if (node.right != null) preOrder(node.right);
        }
    }

    // 중위 순회 (left -> root -> right)
    public static void inOrder(Node node) {
        if (node != null) {
            if (node.left != null) inOrder(node.left);
            System.out.print(node.data);
            if (node.right != null) inOrder(node.right);
        }
    }

    // 후위 순회 (left -> right -> root)
    public static void postOrder(Node node) {
        if (node != null) {
            if (node.left != null) postOrder(node.left);
            if (node.right != null) postOrder(node.right);
            System.out.print(node.data);
        }
    }
}
