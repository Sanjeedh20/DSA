package Recursion;
import java.util.*;
public class SubsetOfString {
	public static void main(String[] args) {
        ArrayList<String> ans=subset("","abc");
        System.out.println(ans);
        int count= ans.size()-1;
        System.out.println(count);
    }
    static ArrayList<String> subset(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=subset(p+ch,up.substring(1));
        ArrayList<String> second=subset(p,up.substring(1));
        first.addAll(second);
        return first;
    }

}
