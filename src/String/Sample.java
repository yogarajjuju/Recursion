package String;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        String str = "bacacd";
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch!='a'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}

