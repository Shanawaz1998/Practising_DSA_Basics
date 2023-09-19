package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = fibo(3);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n <= 1){
            return 1;
        }

        return n*fibo(n-1);
    }
}
