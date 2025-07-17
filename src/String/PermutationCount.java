package String;
import java.util.*;

public class PermutationCount {
    public static void main(String[] args) {
        System.out.println(permcount("","abc"));

    }
    static int permcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count +=permcount(f+ch+s,up.substring(1));

        }
        return count;
    }
}
