// Binary Height balanced Tree is also like  AVL tree

class Node{
    int data,height;
    Node left,right;
    Node(int data){
        this.data=data;
        this.height=1; //height of the leaf node is 1
    }
}
class AVLmethods{
Node root;
int getheight(Node n){  //get height of the node
    if(n == null) return 0;
    return n.height;
}
int getBalance(Node n){  //get for balance factor
    if(n == null) return 0;
    return getheight(n.left)- getheight(n.right);
}

Node rightRotate(Node y){  //right rotation
    Node x=y.left;
    Node T2=x.right;
     
    //rotation
    x.right=y;
    y.left=T2;

    //update heights
    y.height=Math.max(getheight(y.left),getheight(y.right))+1;
    x.height=Math.max(getheight(x.left),getheight(x.right))+1;

    return x;  //new root

}
Node leftRotate(Node y){  //left rotation
    Node x=y.right;
    Node T2=x.left;

    //rotation
    x.left=y;
    y.right=T2;

    //update heights
    y.height=Math.max(getheight(y.left),getheight(y.right))+1;
    x.height=Math.max(getheight(x.left),getheight(x.right))+1;

    return x; //new root
}

     Node insert(Node node,int key){   //insert into AVL tree
    if(node==null)
    {
        return new Node(key);
    }
    if(key<node.data){
      node.left=insert(node.left,key);
    }
    else if(key>node.data){
        node.right=insert(node.right,key);
    }
    else {
        return node;   //duplicates are not allowed
    }

    //update height
    node.height=1+Math.max(getheight(node.left),getheight(node.right));
    int balance=getBalance(node);
    //left left case
    if(balance >1 && key<node.left.data){
        return rightRotate(node);
    }
    //right right case
    if(balance <-1 && key>node.right.data){  
        return leftRotate(node);
    }
    // Left Right
    if (balance > 1 && key > node.left.data) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    // Right Left
    if (balance < -1 && key < node.right.data) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }


    return node;
}

 // Inorder traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    // Preorder traversal
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    // Postorder traversal
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class BinaryHeightBalancedTree{
    public static void main(String[] args) {
        AVLmethods avl=new AVLmethods();
        int[] arr={10,20,30,40,50};
        for(int i:arr){
            avl.root=avl.insert(avl.root,i);
        }
        System.out.println("Inorder Traversal:");
        avl.inorder(avl.root);

        System.out.println("\nPreorder Traversal:");
        avl.preorder(avl.root);

        System.out.println("\nHeight of AVL Tree: " + avl.getheight(avl.root));

        System.out.println("\nPostorder Traversal:");
        avl.postorder(avl.root);
    }
}