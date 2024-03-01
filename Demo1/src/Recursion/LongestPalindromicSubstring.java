package Recursion;
import java.util.*;
public class LongestPalindromicSubstring {

		public static void main(String args[]) {
			String a="abcde";
			System.out.println(longestPalindromeSubseq(a));
		}
		
		static int longestPalindromeSubseq(String s) {
	        StringBuilder sb=new StringBuilder(s);
	        String s1=sb.reverse().toString();
	        int dp[][]=new int[s.length()][s1.length()];
	        for(int b[]:dp){
	            Arrays.fill(b,-1);
	        }
	        return lcs(s,s1,dp,s.length()-1,s1.length()-1);
	    }
	    static int lcs(String s,String s1,int dp[][],int i,int j){
	       if(i<0 || j<0){
	           return 0;
	       }
	       if(dp[i][j]!=-1){
	           return dp[i][j];
	       }
	       if(s.charAt(i)==s1.charAt(j)){
	           return dp[i][j]=1+lcs(s,s1,dp,i-1,j-1);
	       }
	       return dp[i][j]=Math.max(lcs(s,s1,dp,i-1,j),lcs(s,s1,dp,i,j-1));	    }

}
