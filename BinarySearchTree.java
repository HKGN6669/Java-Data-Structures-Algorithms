class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinarySearchTreeMethods {
    Node root = null;

    // inserting data in BST
    public Node Insert(Node root, int data) {
        if (root == null) {
            System.out.println("Inserted: " + data);
            return new Node(data);
        }
        if (data < root.data) {
            root.left = Insert(root.left, data);
        } else {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    // Inorder Traversal to print BST
    public void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.println(root.data + " ");
        inorderTraversal(root.right);
    }
    // Preorder Traversal to print BST
    public void preOrderTraversal(Node root) {
        if (root == null) return;
         
        System.out.println(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // Postorder Traversal to print BST
    public void postOrderTraversal(Node root) {
        if (root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data + " ");
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTreeMethods tree = new BinarySearchTreeMethods();
        tree.root = tree.Insert(tree.root, 50);
        tree.root = tree.Insert(tree.root, 30);
        tree.root = tree.Insert(tree.root, 20);
        tree.root = tree.Insert(tree.root, 40);
        tree.root = tree.Insert(tree.root, 70);
        tree.root = tree.Insert(tree.root, 60);
        tree.root = tree.Insert(tree.root, 80);

        System.out.println("Inorder Traversal of BST: ");
        tree.inorderTraversal(tree.root);      // Print the tree

        System.out.println("Preorder Traversal of BST: ");
        tree.preOrderTraversal(tree.root);

        System.out.println("Postorder Traversal of BST: ");
        tree.postOrderTraversal(tree.root);
    }
}
