package LinkedList;

class DLL{
    Node head;
    Node tail;
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    }
    DLL(){
        head=null;
        tail=null;
    }

    public void insertAtBeginning(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        if(head==null){
            tail=newnode;
        }
        else{
            head.prev=newnode;
        }
        head=newnode;
    }
    public void insertAtpos(int pos,int val){
        Node newnode=new Node(val);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid");
            }
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        if(temp==tail){
            tail=newnode;
        }
        else{
            temp.next.prev=newnode;
            temp.next=newnode;
        }
    }
    void deleteAtpos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("empty");
        }
        if(pos==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            else {
                head.prev = null;
            }
            return;
        }
        Node temp=head;
        Node prev=null;
        for(int i=0;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        if(temp.next==null) {
            tail=prev;
        }else{
            temp.next.prev=prev;
        }

    }
    void displayrev(){
        Node temp=tail ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}


public class DoublyLinkedList {
	 public static void main(String args[]){
	        DLL list=new DLL();
	        list.insertAtBeginning(3);
	        list.insertAtBeginning(7);
	        list.insertAtBeginning(9);
	        list.insertAtBeginning(5);
	        list.display();
	        System.out.println("");
	        list.displayrev();
	        list.insertAtpos(2,6);
	        System.out.println("");
	        list.display();
	        list.deleteAtpos(0);
	        System.out.println("");
	        list.display();
	        list.deleteAtpos(3);
	        System.out.println("");
	        list.display();
	        System.out.println("");
	        list.displayrev();
	    }
}
