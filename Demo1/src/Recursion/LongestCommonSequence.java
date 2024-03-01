package Recursion;
import java.util.*;
public class LongestCommonSequence {
	public static void main(String args[]) {
		String a="abcde";
		String b="accd";
		System.out.println(longestCommonSubsequence(a,b));
	}
	
	static  int longestCommonSubsequence(String text1, String text2) {
        if(text1.length()==0 || text2.length()==0){
            return 0;
        }
        int dp[][]=new int[text1.length()][text2.length()];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        int n= sub(text1,text2,text1.length()-1,text2.length()-1,dp);
    
        return n;
    }
    static int sub(String a,String b,int i,int j,int dp[][]){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+sub(a,b,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(sub(a,b,i-1,j,dp),sub(a,b,i,j-1,dp));
    }

}
