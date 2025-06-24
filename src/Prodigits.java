public class Prodigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(pro(n));
    }
    static  int pro(int n){
        if(n%10==n) return n;
        return (n%10) * pro(n/10);
    }
}
