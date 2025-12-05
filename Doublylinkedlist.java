class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.prev=prev;
        this.data=data;
        this.next=null;
    }
}
class DoublyLLMethods{
      private Node head=null; //global variables
      private Node tail=null; //global variables
      public void addEnd(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
      }
      public void  addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
      }
      public void forwardTraversal(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
      }
      public void backwardTraversal(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data+"<-");
            temp=temp.prev;
        }
        System.out.println("null");
      }
      public void deleteEndOne(){
         if(tail==null){
            System.out.println("No data");
            return;
         }
         tail=tail.prev;
         if(tail!=null){
            tail.next=null;
         }else{
            head=null;
         }
      }
      public void deleteFirstOne(){
         if(head==null){
            System.out.println("No data");
            return;
         }
         head=head.next;
         if(head!=null){
            head.prev=null;
         }else{
            tail=null;
         }
      }
}
public class Doublylinkedlist{
    public static void main(String[] args){
      DoublyLLMethods d=new DoublyLLMethods();
      d.addEnd(60);
      d.addEnd(70);
      d.addFirst(10);
      d.addFirst(20);
      d.addFirst(30);
      d.addFirst(40);
      System.out.println("Before deleting at End and at first:");
      d.forwardTraversal();
      d.backwardTraversal(); 
      d.deleteFirstOne();
      d.deleteEndOne();
      System.out.println("After deleting at end and at first:");
      d.forwardTraversal();
      d.backwardTraversal();
    }
}