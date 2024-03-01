package Arrays;
import java.util.*;
public class InsertingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
	        int i,n;
	        n=in.nextInt();
	        int a[]=new int[n];
	        for(i=0;i<n;i++){
	            a[i]=in.nextInt();
	        }
	        for(i=0;i<n;i++){
	            System.out.println(a[i]);
	        }
	        int key,pos;
	        key=in.nextInt();
	        pos=in.nextInt();
	        a=java.util.Arrays.copyOf(a,n+1);
	        for(i=n-1;i>=pos;i--){
	            a[i+1]=a[i];
	        }
	        a[pos]=key;
	        for(i=0;i<n+1;i++){
	            System.out.println(a[i]);
	        }
	}

}
