public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digit(n));
    }
    static  int digit(int n){
        if(n<=0) return 0;
        return digit(n/10)+n%10;
    }
}
