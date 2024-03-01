package StacknQueue;
class QueueArray{
    int front,rear;
    static final int max=30;
    int a[]=new int[max];
    QueueArray(){
        front=-1;
        rear=-1;
    }
    public void Enqueue(int val){
        if(rear==max-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1){
            front+=1;
        }
        a[++rear]=val;
    }
    public int Dequeue(){
        if(front==-1 && front>rear){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return a[front++];
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(a[i]+" ");
        }
    }
}



public class QueueUsingArray {
	 public static void main(String[] args) {
	        QueueArray queue=new QueueArray();
	        for(int i=1;i<=10;i++){
	            queue.Enqueue(i);
	        }
	        System.out.println("Element removed from the queue:"+queue.Dequeue());
	        queue.display();
	    }
}
