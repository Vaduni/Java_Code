//time complexity :O(h), where h is the height of the tree

package Java_Code;

public class BinarySearchTree_Insert {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        // left subtree
        if (root.data > value) {
            root.left = insertNode(root.left, value);
        }
        // right subtree
        else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        int Nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < Nodes.length; i++) {
            root = insertNode(root, Nodes[i]);
        }
        inorder(root);
        System.out.println();
    }
}
