package StacknQueue;

class StackArray{
    static final int max_size=30;
    int a[]=new int[max_size];
    int top;
    StackArray(){
        top=-1;
    }
    public void push(int val){
        top=top+1;
        if(top>=30){
            throw new IndexOutOfBoundsException("Stack is full");
        }
        a[top]=val;
    }
    public int pop(){
        if(top==-1){
           throw new IndexOutOfBoundsException("Stack is empty");
        }
        return a[top--];
    }
    public int peek(){
        return a[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(a[i]+" ");
        }
    }
}

public class StackUsingArray {
	public static void main(String[] args) {
	       StackArray stack=new StackArray();
	       for(int i=1;i<=10;i++){
	           stack.push(i);
	       }
	       System.out.println("Element that pop out of stack:"+stack.pop());
	       System.out.println(stack.isEmpty());
	       System.out.println(stack.size());
	       stack.display();
	    }
}
