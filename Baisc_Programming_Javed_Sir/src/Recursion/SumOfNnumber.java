package Recursion;

public class SumOfNnumber {
    public static void main(String[] args) {
        System.out.println(sum(8));
        System.out.println(sumPara(8, 0));
        System.out.println(proDigits(54321));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    static int sumPara(int n, int sum){
        if(n == 0){
            return 0;
        }
        return n + sumPara(n-1, sum);

    }
    static int proDigits(int n){
       if(n%10 == n){
           return n;
       }
       return n%10 * proDigits(n/10);
    }
}
