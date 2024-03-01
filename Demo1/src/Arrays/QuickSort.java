package Arrays;
import java.util.*;
public class QuickSort {

	 public static void main(String args[]) {
	        int[] a={5,4,3,2,1};
	        a=mergesort(a);
	        System.out.println(Arrays.toString(a));
	    }
	    static int[] mergesort(int[] a){
	        if(a.length==1){
	            return a;
	        }
	        int mid=a.length/2;
	        int[] left=mergesort(Arrays.copyOfRange(a,0,mid));
	        int[] right=mergesort(Arrays.copyOfRange(a,mid,a.length));
	        return merge(left ,right);
	    }
	    static int[] merge(int[] left,int[] right){
	        int[] mix=new int[left.length+right.length];
	        int i=0,j=0,k=0;
	        while(i<left.length && j< right.length){
	            if(left[i]<right[j]){
	                mix[k]=left[i];
	                i++;
	            }else{
	                mix[k]=right[j];
	                j++;
	            }
	            k++;
	        }
	        while(i< left.length){
	            mix[k]=left[i];
	            i++;
	            k++;
	        }
	        while(j< right.length){
	            mix[k]=right[j];
	            j++;
	            k++;
	        }
	        return mix;
	    }

}
