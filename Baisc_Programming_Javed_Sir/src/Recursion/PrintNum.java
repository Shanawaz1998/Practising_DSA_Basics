package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        funNum(5);
//        funNumRev(5);
//        funNumBoth(5);
    }

    static void funNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funNum(n-1); //We cannot use n-- because it does not return the value, it just changes the value
    }

    static void funNumRev(int n){
        if(n == 0){
            return;
        }
        funNumRev(n-1);
        System.out.println(n);
    }

    static void funNumBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funNumBoth(n-1);
        System.out.println(n);
    }
}
