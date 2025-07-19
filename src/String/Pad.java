package String;
import java.util.*;

public class Pad {
    public static void main(String[] args) {
        System.out.println(pad("","12"));

    }
    static ArrayList<String>pad(String p ,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){

            list.add(p);
            return list;


        }

        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch =(char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));


        }
        return list;


    }
}
