class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
   
}

class StackUsingLinkedList {
    static Node top = null;   // top of stack

    // PUSH operation
    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }
    // POP operation
    public static int pop() {
        if (top == null) {
            System.out.println("No data");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        System.out.println(popped + " popped from stack");
        return popped;
    }
    // PEEK operation
    public static int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    // DISPLAY Stack
    public static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // CHECK EMPTY
    public static boolean isEmpty() {
        return top == null;
    }
}

public class Stacklinkedlist {
    public static void main(String[] args) {

        StackUsingLinkedList.push(10);
        StackUsingLinkedList.push(20);
        StackUsingLinkedList.push(30);
        StackUsingLinkedList.push(40);

        StackUsingLinkedList.display();
        StackUsingLinkedList.pop();
        StackUsingLinkedList.display();

        System.out.println("Top element is: " + StackUsingLinkedList.peek());

        StackUsingLinkedList.pop();
        StackUsingLinkedList.display();
    }
}