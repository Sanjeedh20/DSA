package LinkedList;

class ll{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
        }
        Node(int val,Node next){
            data=val;
            this.next=next;
        }
    }
    ll(){
         this.size=0;
    }
    public void insertAtBegin(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
       size=size+1;
    }
    public void insertAtLast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertAtBegin(val);
            return;
        }
        tail.next=node;
        tail=node;
        size=size+1;
    }
    public void insertAtPos(int val,int index){
        if(index==0){
            insertAtBegin(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size=size+1;
    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    public Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
   public void deleteAtfirst(){
       head=head.next;
       if(head==null){
           tail=head;
       }
       size=size-1;
   }
   public void deleteAtLast(){
        if(size<=1){
            deleteAtfirst();
            return;
        }
        Node last=get(size-2);
        tail=last;
        tail.next=null;
   }
   public Node get(int index){
    Node node=head;
    for(int i=0;i<index;i++){
        node=node.next;
    }
    return node;
   }
   public void deleteAtpos(int index){
        if(index==0){
            deleteAtfirst();
            return;
        }
        if(index==size-1){
            deleteAtLast();
            return;
        }
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;

   }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    public void RemoveDup(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                size=size-1;
            }
            else{
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }
    public void bubblesort(int r,int c){
        Node first=get(c);
        Node second=get(c+1);
        if(r==0){
            return;
        }
        if(c<r){
            if(first.data > second.data){
                if(first==head){
                    first.next=second.next;
                    second.next=first;
                    head=second;
                }
                else if(second==tail){
                    Node prev=get(c-1);
                    prev.next=second;
                    second.next=first;
                    first.next=null;
                    tail=first;
                }
                else{
                    Node prev=get(c-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubblesort(r,c+1);
        }
        else{
            bubblesort(r-1,0);
        }
    }

}


public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll list=new ll();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertRec(5,0);
        list.bubblesort(list.size-1, 0);
        System.out.println(list.head.data);
        //list.RemoveDup();
        list.display();
//        System.out.println();
//        System.out.println(list.size);
	}

}
