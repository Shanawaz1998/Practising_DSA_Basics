package Recursion;
//To get the nth fibonacci no.
public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        int last = fibo(n-1);
        int sLast = fibo(n-2);
        return last + sLast;
    }
}
