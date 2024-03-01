package Recursion;

public class LongestCommonSubstring {
	public static void main(String args[]) {
		String a="abcde";
		String b="accd";
		System.out.println(lcs(a,b));
	}
	public static int lcs(String str1, String str2){
        // Write your code here.
        int n=str1.length();
        int m=str2.length();
        int i,j,max=0;
        int dp[][]=new int[n+1][m+1];
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }
}
