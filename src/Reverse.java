public class Reverse {
    public static void main(String[] args) {
        int n = 1342;
        rev1(n);
        System.out.println(sum);

    }
    static int sum =0;
    static void rev1(int n){
        if(n==0) return;
        int rem =n%10;
        sum=sum*10+rem;
        rev1(n/10);

    }
    static void rev2(int n){

    }
}
