package Arrays;
import java.util.*;

public class DiceList {
    public static void main(String[] args) {
        System.out.println(dice("",4));

    }
    static ArrayList<String>dice (String p ,int target){
        ArrayList<String> list = new ArrayList<>();
        if(target==0){
//            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        for(int i=1; i<=6&&i<=target;i++){

            list.addAll(dice(p+i,target-i));


        }
        return list;
    }
}
