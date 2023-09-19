package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }
    static int ans = 0;
    static int sum(int n ){
        if(n == 0 ){
            return 0;
        }
        ans = (n%10)+sum(n/10);
        return ans;
    }
}
