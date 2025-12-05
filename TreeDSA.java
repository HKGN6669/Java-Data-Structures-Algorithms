class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    // Inorder Traversal
    public void inOrderTraversal(Node node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    // Preorder Traversal
    public void preOrderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // Postorder Traversal
    public void postOrderTraversal(Node node) {
        if (node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public int countOfNodes(Node node){
        if(node==null){
            return 0;
        }
        return 1+countOfNodes(node.left)+countOfNodes(node.right);
    }
    //finding height of tree 
    public int find(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(find(node.left),find(node.right));
    }
    //finding the sum of node data
    public int SumOfNodes(Node node){
        if(node==null){
            return 0;
        }
        return node.data + SumOfNodes(node.left)+SumOfNodes(node.right);
    }
    //finding sum of the leafs
    public int sumOfEndNodes(Node node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        return sumOfEndNodes(node.left)+sumOfEndNodes(node.right);
    }
    //deleting tree data
    //Deleting the entire tree
    public void deleteTree() {
    root = null;  // JVM garbage collector will free memory
    System.out.println("Tree deleted successfully.");
    }

}

public class TreeDSA {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("Inorder: ");
        tree.inOrderTraversal(tree.root);

        System.out.print("\nPreorder: ");
        tree.preOrderTraversal(tree.root);

        System.out.print("\nPostorder: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("count of the nodes");
        System.out.println(tree.countOfNodes(tree.root));
        System.out.println("the height of tree is:");
        System.out.println(tree.find(tree.root));
        System.out.println("the sum of nodes data is:");
        System.out.println(tree.SumOfNodes(tree.root));
        System.out.println("the sum of end nodes  is:");
        System.out.println(tree.sumOfEndNodes(tree.root));
        tree.deleteTree();
    }
}