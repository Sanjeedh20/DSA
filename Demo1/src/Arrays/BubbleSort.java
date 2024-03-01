package Arrays;
import java.util.*;
public class BubbleSort {
	public static void main(String args[]) {
		  int i,j,n;
	        n=5;
	        boolean swap=false;
	        int a[]={3,4,1,5,2};
	        for(i=0;i<n;i++){
	            for(j=1;j<n-i;j++){
	                if(a[j]<a[j-1]){
	                    int temp=a[j];
	                    a[j]=a[j-1];
	                    a[j-1]=temp;
	                    swap=true;
	                }
	            }
	            if(!swap){
	                break;
	            }
	        }
	        System.out.println(Arrays.toString(a));
	}

}
