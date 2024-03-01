package Recursion;
import java.util.*;
public class Maze {
	//Maze Problem:Print and Count the number of ways to go the destination in a matrix
    public static void main(String[] args) {
        System.out.println(countMaze(3,3));
        System.out.println(possibleways("",3,3));
    }
    static ArrayList<String> possibleways(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(possibleways(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(possibleways(p+'R',r,c-1));
        }
        return ans;
    }
    static int countMaze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=countMaze(r-1,c);
        int right=countMaze(r,c-1);
        return left+right;
    }
}
