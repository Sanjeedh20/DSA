package LinkedList;

class CLL {
   Node last;
   class Node{
       int data;
       Node next;
       Node(int val){
           data=val;
           next=null;
       }
   }
   CLL(){
       last=null;
   }
   public void inserAtbeginning(int val){
       Node newnode=new Node(val);
       if(last==null){
           newnode.next=newnode;
           last=newnode;
       }
       else{
           newnode.next=last.next;
           last.next=newnode;
       }
   }
   public void insertAtend(int val) {
       Node newnode = new Node(val);
       if (last == null) {
           newnode.next = newnode;
           last = newnode;
       } else {
           newnode.next = last.next;
           last.next = newnode;
           last = newnode;
       }
   }
   public void display(){
       if(last==null){
           return;
       }
       Node temp=last.next;
       do{
           System.out.print(temp.data+" ");
           temp=temp.next;
       }while(temp!=last.next);
   }
   public void deleteAtbeginning(){
       if(last==null){
           throw new IndexOutOfBoundsException("empty");
       }
       if(last.next==last){
           last=null;
       }
       else{
           last.next=last.next.next;
       }
   }
   public void deleteAtend(){
       if(last==null){
           throw new IndexOutOfBoundsException("list is empty");
       }
       if(last.next==last){
           last=null;
       }
       else{
           Node temp=last.next;
           while(temp.next!=last){
               temp=temp.next;
           }
           temp.next=last.next;
           last=temp;
       }
   }

}


public class CircularLinkedList {
	 public static void main(String args[]){
	        CLL list=new CLL();
	        list.inserAtbeginning(1);
	        list.inserAtbeginning(2);
	        list.inserAtbeginning(3);
	        list.inserAtbeginning(4);
	        list.display();
	        System.out.print("\n");
	        list.deleteAtbeginning();
	        list.display();
	        System.out.print("\n");
	        list.deleteAtend();
	        list.display();
	    }
}
