//time complexity:O(n)

package Java_Code;

public class BinaryTree_Diameter_2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameterOfTree(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfTree(root.left);
        TreeInfo right = diameterOfTree(root.right);
        int myHeight = Math.max(left.height, right.height) + 1;
        int leftDiameter = left.diameter;
        int rightDiameter = right.diameter;
        int rootDiameter = left.height + right.height + 1;
        int myDiameter = Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
        TreeInfo ans = new TreeInfo(myHeight, myDiameter);
        return ans;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Diameter of tree : " + diameterOfTree(root).diameter);
    }
}
