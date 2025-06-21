public class Fibon {
    public static void main(String[] args) {
        System.out.println(Fiboformula(50));
    }
    static int Fiboformula(int n){
        return (int) (Math.pow((1+ Math.sqrt(5)/2),n)/Math.sqrt(5));
    }

}// without recursion
