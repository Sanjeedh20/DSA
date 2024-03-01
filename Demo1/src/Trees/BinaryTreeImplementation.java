package Trees;

import java.util.*;
class BinaryTree{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
        }
    }
    public void insert(Scanner in){
        System.out.println("Enter the root node:");
        int val=in.nextInt();
        root=new Node(val);
        insert(in,root);
    }
    public void insert(Scanner in,Node node){
        System.out.println("Do you want to enter left of "+node.data);
        boolean left=in.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+node.data);
            int val=in.nextInt();
            node.left=new Node(val);
            insert(in,node.left);
        }
        System.out.println("Do you want to enter right of "+node.data);
        boolean right=in.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+node.data);
            int val=in.nextInt();
            node.right=new Node(val);
            insert(in,node.right);
        }
    }
    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.data + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data + " ");
    }
   
}


public class BinaryTreeImplementation {
	 public static void main(String[] args) {
	      Scanner in=new Scanner(System.in);
	      BinaryTree bt=new BinaryTree();
	      bt.insert(in);
	      bt.postOrder();
	    }
}
