package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int key = 8;
	        int[] a ={1,2,3,4,5,8};
	        int ans=LinearSearch(a,0,key);
	        if(ans==-1){
	            System.out.println("Not found");
	        }
	        else{
	            System.out.println("Found at "+ans);
	        }
	    }
	    static int LinearSearch(int[] a,int index,int key){
	        if(a[index]==key){
	            return index;
	        }
	        if(index==a.length-1){
	            return -1;
	        }
	        return LinearSearch(a,index+1,key);
	    }
	}

