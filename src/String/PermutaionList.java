package String;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class PermutaionList {
    public static void main(String[] args) {
        ArrayList<String> ans = permulist("","abc");
        System.out.println(ans);


    } static ArrayList<String> permulist(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s =p.substring(i,p.length());
            ans.addAll(permulist(f+ch+s,up.substring(1)));

        }
        return ans;
    }
}

