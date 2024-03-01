package StacknQueue;

class Queuell {
    Node front;
    Node rear;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
        }
    }
    Queuell(){
        front=null;
        rear=null;
    }
    public void Enqueue(int val){
        Node node=new Node(val);
        if(front==null){
            front=rear=node;
            return;
        }
        rear.next=node;
        rear=node;
    }
    public int Dequeue(){
        int temp=front.data;
        front =front.next;
        return temp;
    }
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}


public class QueueUsingLL {
	public static void main(String[] args) {
        Queuell queue=new Queuell();
        for(int i=1;i<=10;i++){
            queue.Enqueue(i);
        }
        System.out.println("Element removed from the queue:"+queue.Dequeue());
        queue.display();
    }
}
