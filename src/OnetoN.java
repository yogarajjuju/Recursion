public class OnetoN {
    public static void main(String[] args) {
        revfun(5);
    }
    static void revfun(int n){
        if(n==0){
            return;
        }
        revfun(n-1);
        System.out.println(n);

    }
}
