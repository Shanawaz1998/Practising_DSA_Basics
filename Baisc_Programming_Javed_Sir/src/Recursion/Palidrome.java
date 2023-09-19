package Recursion;

public class Palidrome {
    public static void main(String[] args) {
        int n = 211112;
        System.out.println(n == reverse(n));
    }

    static int reverse(int n){
        if(n%10 ==n){
            return n;
        }
        int digit = (int) (Math.log10(n)+1);
        return (n%10)*(int)Math.pow(10,digit-1)+reverse(n/10);
    }
}
