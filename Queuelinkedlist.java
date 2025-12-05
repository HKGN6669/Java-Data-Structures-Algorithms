class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueMethods{
    private Node front=null; //global variables
    private Node rear=null;  //global variables
    // Adding function
    public void enQueue(int data){
       Node newNode=new Node(data);
       if(rear==null){
           rear=front=newNode;
           return;
       }
       rear.next=newNode;
       rear=newNode; 
    }
    // removing value
    public void deQueue(){
        if(front==null){
            System.out.println("No data");
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    // display function
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void frontValue(){
        if(front==null){
            System.out.println("Queue is Empty!");
            return;
        }else{
            System.out.println("Element is:"+front.data);
        }
    }
}
public class Queuelinkedlist{
    public static void main(String[] args){
        QueueMethods q=new QueueMethods();
        q.enQueue(10);
        q.enQueue(30);
        q.enQueue(50);
        q.enQueue(60);
        System.out.println("Original data");
        q.display();
        q.deQueue();
        q.display();
        q.frontValue();
    }
}