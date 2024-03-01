package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[]{1, 2, 3, 4, 5, 6, 7,8};
	     int target=4;
	     int s=0,e=a.length-1;

	     System.out.println(search(a,target,s,e));
	    }
	    static int search(int a[],int target,int s,int e){
	        if(s>e){
	            return -1;
	        }
	        int m=(s+e)/2;
	        if(target==a[m]){
	            return m;
	        }
	        if(target<a[m]){
	            return search(a,target,s,m-1);
	        }
	        return search(a,target,m+1,e);
	}

}
