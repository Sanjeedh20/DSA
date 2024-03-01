package Recursion;
import java.util.*;
public class SubArray {
	public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(subsets(a));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int a:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> list=new ArrayList<>(outer.get(i));
                list.add(a);
                outer.add(list);
            }
        }
        return outer;
    }
}
