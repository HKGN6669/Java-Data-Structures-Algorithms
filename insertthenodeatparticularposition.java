class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    static Node head;  // global head

    // Insert at particular index
    public static void indexInsert(int data, int index) {
        Node newNode = new Node(data);

        if (index == 0) {
            addfirst(data);
            return;
        }

        Node temp = head;

        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;   // FIXED
    }

    // Count nodes
    public static int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add at first
    public static void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
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

    // Search for a value
    public static boolean search(int key) {
        Node temp = head;

        while (temp != null) {   // FIXED
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

public class insertthenodeatparticularposition {
    public static void main(String[] args) {

        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);

        ListOfFunctions.display();
        System.out.println("Total nodes: " + ListOfFunctions.count());

        // Test index insert
        ListOfFunctions.indexInsert(999, 2);
        ListOfFunctions.display();

        // Test search
        System.out.println("Search 50 : " + ListOfFunctions.search(50));
        System.out.println("Search 100 : " + ListOfFunctions.search(100));
    }
} 