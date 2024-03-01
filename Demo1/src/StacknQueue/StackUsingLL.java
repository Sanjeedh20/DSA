package StacknQueue;

class Stackll{
    Node top;
    int size;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
        }
    }
    Stackll(){
        top=null;
        head=null;
        size=0;
    }
    public void push(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        else {
            top.next=node;
        }
        top=node;
        size+=1;
    }
    public int pop(){
        if(top==null){
            throw new IndexOutOfBoundsException("Stack is Empty");
        }
        int temp=top.data;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        top=prev;
        top.next=null;
        size-=1;
        return temp;
    }
    public int peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
}

public class StackUsingLL {
	public static void main(String[] args) {
	       Stackll stack=new Stackll();
	       for(int i=1;i<=10;i++){
	           stack.push(i);
	       }
	       System.out.println("Element that pop out of stack:"+stack.pop());
	       System.out.println(stack.isEmpty());
	       System.out.println(stack.getSize());
	       stack.display();
	    }


}
