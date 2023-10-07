package Recursion;

public class Palidrome {
    public static void main(String[] args) {
        int n = 211112;
//        System.out.println(n == reverse(n));
        String s = "xerex";
        System.out.println(palindrome(s, 0));
    }

    static int reverse(int n){
        if(n%10 ==n){
            return n;
        }
        int digit = (int) (Math.log10(n)+1);
        return (n%10)*(int)Math.pow(10,digit-1)+reverse(n/10);
    }
    static boolean palindrome(String s, int i){
        if(i > s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrome(s, i+1);
    }
}
