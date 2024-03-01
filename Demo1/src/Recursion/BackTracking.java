package Recursion;
import java.util.*;
public class BackTracking {

    public static void main(String[] args) {
        boolean a[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int b[][]=new int [3][3];
        possibleways("",a,0,0,b,1);
    }
    static void possibleways(String p,boolean maze[][],int r,int c,int path[][],int step){
        if(r== maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int num[]:path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r< maze.length-1){
            possibleways(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            possibleways(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            possibleways(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            possibleways(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
