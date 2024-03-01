package Trees;

class BinarySearchTree{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int val){
            data = val;
        }
    }
    BinarySearchTree(){
        root=null;
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int val){
        root=insert(val,root);
    }
    public Node insert(int val,Node node){
        if(node==null){
           node = new Node(val);
           return node;
        }
        if(val<node.data){
            node.left=insert(val,node.left);
        }
        else{
            node.right=insert(val,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void populate(int nums[]){
        for(int i=0;i< nums.length;i++){
            insert(nums[i]);
        }
    }
    public void display(){
        display(root,"Root Node : ");
    }
    public void display(Node node,String details){
        if(node==null){
            return ;
        }
        System.out.println(details+ node.data);
        display(node.left,"left child of "+node.data+" : ");
        display(node.right,"right child of "+node.data+" : ");
    }
}


public class BST {
	public static void main(String[] args) {
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        BinarySearchTree bst=new BinarySearchTree();
        bst.populate(nums);
        bst.display();
    }
}
