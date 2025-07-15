package String;
import java.util.*;

public class SubseqAscii {
    public static void main(String[] args) {
        Asci(" ","abc");

    }
    static void Asci(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Asci(p+ch,up.substring(1));
        Asci(p,up.substring(1));
        Asci(p+(ch+0),up.substring(1));
    }
}
