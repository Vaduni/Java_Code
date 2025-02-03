//time complexity :O(h), where h is the height of the tree

package Java_Code;

public class BinarySearchTree_Delete {
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

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        // root.data==val;
        else {
            // case 1 : No Child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3: two children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.right;
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
        delete(root, 3);
        inorder(root);
    }
}
