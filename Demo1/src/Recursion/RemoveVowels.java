package Recursion;

public class RemoveVowels {

	public static void main(String args[]){
	       System.out.print(skip("bccaed"));
	    }
	    static String skip(String up){
	        if(up.isEmpty()){
	            return "";
	        }
	        char ch=up.charAt(0);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	            return skip(up.substring(1));
	        }
	        else{
	            return ch+skip(up.substring(1));
	        }
	    }

}
