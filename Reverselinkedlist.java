class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfFunctions{
    static Node head; //global variable
    public static int count(){ //to count the values
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void display(){ //to display given input
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addfirst(int data){
         Node newNode=new Node(data);
         newNode.next=head;
         head=newNode;
    }
    public static void insert(int data){ //insertion operation
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void reverseList(){ //to reverse the list
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}
public class Reverselinkedlist{
    public static void main(String[] args){
        ListOfFunctions.insert(10);
        ListOfFunctions.insert(50);
        ListOfFunctions.insert(20);
        ListOfFunctions.insert(60);
        ListOfFunctions.addfirst(70);
        System.out.println("Original List");
        ListOfFunctions.display();
        System.out.println("\nNumber of nodes:"+ListOfFunctions.count());
        ListOfFunctions.reverseList();
        System.out.println("\nRversedList:");
        ListOfFunctions.display();
    }
}