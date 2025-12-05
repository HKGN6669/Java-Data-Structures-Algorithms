class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    static Node head; // global head

    // Count nodes in linked list
    public static int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display the linked list
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add node at beginning
    public static void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert node at end
    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Reverse the linked list
    public static void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // DELETE NODE AT PARTICULAR INDEX
    public static void deleteIndex(int index) {

        if (head == null) {
            System.out.println("No Data");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        // Delete first node
        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        int i = 0;

        // Move to node before index
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Delete the node
        temp.next = temp.next.next;
    }

    // DELETE NODE BY VALUE (corrected)
    public static void deleteByValue(int value) {

        if (head == null) {
            System.out.println("No data.");
            return;
        }

        // If value is in the first node
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Find previous node of the target node
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        // If value not found
        if (temp.next == null) {
            System.out.println("Value not found!");
            return;
        }

        // Delete the node
        temp.next = temp.next.next;
    }
}

public class DeletelistbyValue {
    public static void main(String[] args) {

        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);

        System.out.println("Original List:");
        ListOfFunctions.display();

        System.out.println("\nNumber of nodes: " + ListOfFunctions.count());

        ListOfFunctions.reverse();
        System.out.println("\nReversed List:");
        ListOfFunctions.display();

        System.out.println("\nAfter deleting index 2:");
        ListOfFunctions.deleteIndex(2);
        ListOfFunctions.display();

        System.out.println("\nAfter deleting Value (100):");
        ListOfFunctions.deleteByValue(100);
        ListOfFunctions.display();

        System.out.println("\nAfter deleting Value (70):");
        ListOfFunctions.deleteByValue(70);
        ListOfFunctions.display();
    }
}
