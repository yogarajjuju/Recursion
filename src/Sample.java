public class Sample {
    public static void main(String[] args) {
        print(1);
    }
    public static  void print(int n ){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //this is called tail recursion
        print(n+1);

    } 
}
