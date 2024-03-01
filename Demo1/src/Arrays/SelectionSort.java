package Arrays;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {5,3,4,2,1};
       int i,j,temp;
       for(i=0;i<a.length;i++) {
    	   for(j=i+1;j<a.length;j++) {
    		   if(a[i]>a[j]) {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
       }
       System.out.println(Arrays.toString(a));
	}

}
