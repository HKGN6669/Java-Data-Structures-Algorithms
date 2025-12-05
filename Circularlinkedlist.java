class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLLMethods {
    private Node head = null;

    // Insert at end
    public void insertatEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at first
    public void insertatFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Insert by position
    public void inseratposition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertatFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;

            // If list is shorter than position
            if (temp == head) {
                System.out.println("Position out of range");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the values
    public void display() {
        if (head == null) {
            System.out.println("no data");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
    //delete at first
    public void deleteatFirst(){
        if(head==null){
            System.out.println("list is Empty");
            return;
        }
        
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
        
    }
    public void deleteatEnd(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    
    }
    public void deleteatposition(int position){
        if(head==null){
            System.out.println("No data");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        int count=0;
        while(count<position-1&&temp.next!=head){
            temp=temp.next;
            count++;
        }
        if(temp.next==head){
            System.out.println("Position ot of bounds");
            return;
        }
        temp.next=temp.next.next;
        
    }
    
}

public class Circularlinkedlist {
    public static void main(String[] args) {
        CircularLLMethods c = new CircularLLMethods();
        System.out.println("inserting at end");
        c.insertatEnd(10);
        c.insertatEnd(20);
        c.insertatEnd(30);
        c.insertatEnd(40);
        c.display();
        System.out.println("inserting at first");
        c.insertatFirst(50);
        c.display();
        System.out.println("insert at a position");
        c.inseratposition(55,3 );  // will show "Position out of range"
        c.display();
        System.out.println("delete at first");
        c.deleteatFirst();
        c.display();
        System.out.println("delete at end");
        c.deleteatEnd();
        c.display();
        System.out.println("delete at position");
        c.deleteatposition(3);
        c.display();
    }
}