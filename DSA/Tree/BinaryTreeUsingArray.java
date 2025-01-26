class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeUsingArray {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
        idx++;
        if (idx >= nodes.length) {
            return null;
        }

        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        int nodes[] = { 9, 2, 3, 4, 5 };
        
        BinaryTreeUsingArray tree = new BinaryTreeUsingArray();
        Node root = tree.buildTree(nodes);
        // System.out.print(root.data + " "); // Print root of the tree

        System.out.println("Preorder Traversal: ");
        preOrder(root);

        System.out.println("\nInorder Traversal: ");
        inOrder(root);

        System.out.println("\nPostorder Traversal: ");
        postOrder(root);
    }
}