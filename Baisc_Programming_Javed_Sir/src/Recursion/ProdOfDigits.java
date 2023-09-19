package Recursion;

public class ProdOfDigits {
    public static void main(String[] args) {
        int ans = prod(1234);
        System.out.println(ans);

    }
    static int ans = 0;
    static int prod(int n){
        if(n%10 == n){ // return the last no.
            return n;
        }
        ans = (n%10)*prod(n/10);
        return ans;
    }
}
