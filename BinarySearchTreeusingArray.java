class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinarysearchFunctions {

    Node root;

    BinarysearchFunctions() {
        this.root = null;
    }

    // ----------------- INSERT NODE ------------------
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }


    // Inorder (Left, Root, Right)
    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    // Preorder (Root, Left, Right)
    public void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // Postorder (Left, Right, Root)
    public void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    // Search element
    public String searchElement(Node root, int value) {
        if (root == null) {
            return "Not Found";
        }

        if (root.data == value) {
            return "Element Found";
        }

        if (value < root.data) {
            return searchElement(root.left, value);
        } else {
            return searchElement(root.right, value);
        }
    }

    // Minimum value
    public int minimumValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Maximum value
    public int maximumValue(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    // Reflect BST
    public void reflect(Node node) {
        if (node == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        reflect(node.left);
        reflect(node.right);
    }

    // ---------------- DELETE BY VALUE (BST) ----------------
    public Node deleteByvalue(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = deleteByvalue(root.left, value);
        }
        else if (value > root.data) {
            root.right = deleteByvalue(root.right, value);
        }
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            int min = minimumValue(root.right);
            root.data = min;
            root.right = deleteByvalue(root.right, min);
        }

        return root;
    }

    // Wrapper for deleteByvalue
    public void deleteByvalue(int value) {
        root = deleteByvalue(root, value);
    }

    // Delete entire tree
    public void delete() {
        root = null;
    }
}


public class BinarySearchTreeusingArray {
    public static void main(String[] args) {

        BinarysearchFunctions tree = new BinarysearchFunctions();

        // Insert elements from array
        int[] arr = {1, 4, 3, 5, 2, 7, 4, 3};
        for (int i : arr) {
            tree.insert(i);
        }

        // Traversals
        System.out.println("Inorder Traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postOrderTraversal(tree.root);

        // Search, Min, Max
        int searchValue = 5;
        System.out.println("\n\nSearching for " + searchValue + ":");
        System.out.println(tree.searchElement(tree.root, searchValue));
        System.out.println("\nMinimum value is: " + tree.minimumValue(tree.root));
        System.out.println("Maximum value is: " + tree.maximumValue(tree.root));

        // ----------- DELETE BEFORE REFLECTING (IMPORTANT) ------------
        System.out.println("\n\nDeleting value 2:");
        tree.deleteByvalue(2);
        tree.inOrderTraversal(tree.root);

        // ----------- NOW REFLECT THE TREE --------------------------
        tree.reflect(tree.root);

        System.out.println("\n\nInorder Traversal of Reflected Tree:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPreorder Traversal of Reflected Tree:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nPostorder Traversal of Reflected Tree:");
        tree.postOrderTraversal(tree.root);

        // Delete entire tree
        System.out.println("\n\nDeleting entire tree...");
        tree.delete();

        System.out.println("Inorder after deleting entire tree:");
        tree.inOrderTraversal(tree.root);
    }
}