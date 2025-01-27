import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeUsingArray {
     int idx = -1;

    // class to store height and diameter of the tree
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // method to build the tree
    public Node buildTree(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);

        return root;
    }

    // method to traverse the tree in preorder
    public static void preOrder(Node root) {
        if (root == null || root.data == -1) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // method to traverse the tree in inorder
    public static void inOrder(Node root) {
        if (root == null || root.data == -1) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // method to traverse the tree in postorder
    public static void postOrder(Node root) {
        if (root == null || root.data == -1) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // method to traverse the tree in level order with the help of queue
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    // method to count the number of nodes in the tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = count(root.left);
        int rightNodes = count(root.right);

        int count = leftNodes + rightNodes + 1;

        return count;
    }

    // method to calculate the sum of all the nodes in the tree
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        int sum = leftSum + rightSum + root.data;

        return sum;
    }

    // method to calculate the height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // method to calculate the diameter of the tree but time complexity is O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int diam3 = height(root.left) + height(root.right) + 1;

        int diameter = Math.max(Math.max(rightDiameter, leftDiameter), diam3);

        return diameter;
    }

    public static TreeInfo diameterOptimized(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterOptimized(root.left);
        TreeInfo right = diameterOptimized(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;

        int diam3 = left.height + right.height + 1;

        int diameter = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(height, diameter);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        System.out.println("Comparing " + root.data + " with " + subRoot.data);

        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return false;
    }

    public static boolean isSubTree(Node root, Node subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        System.out.println("Checking if " + subRoot.data + " is a subtree of " + root.data);

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTreeUsingArray tree = new BinaryTreeUsingArray();
        BinaryTreeUsingArray subTree = new BinaryTreeUsingArray();
        Node root = tree.buildTree(nodes);
        System.out.print("Root = " + root.data + " "); // Print root of the tree

        System.out.println("Preorder Traversal: ");
        preOrder(root);

        System.out.println("\nInorder Traversal: ");
        inOrder(root);

        System.out.println("\nPostorder Traversal: ");
        postOrder(root);

        System.out.println("\nLeveled Order : ");
        levelOrder(root);

        System.out.println("Count of the tree: " + count(root));

        System.out.println("Sum of the tree: " + sumOfNodes(root));

        System.out.println("Height of the tree: " + height(root));

        long startTime = System.nanoTime();
        System.out.println("Diameter of the tree: " + diameterOptimized(root));
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000;

        System.out.println("complexity: " + executionTime + "ms");

        int subNodes[] = { 2, 4, -1, -1, 5, -1, -1 };
        Node subRoot = subTree.buildTree(subNodes);
        boolean res = isSubTree(root, subRoot);
        System.out.println("Is subroot a subtree of the root:" + res);

        }
}
