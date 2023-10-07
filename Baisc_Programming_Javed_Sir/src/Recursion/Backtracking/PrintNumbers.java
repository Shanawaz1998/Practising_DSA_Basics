package Recursion.Backtracking;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumber(9);
        printReverse(1, 9);
    }

//    Condition - here we can only use minus for backtracking
     static void printNumber(int n) {
        if(n == 0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }

    static void printReverse(int n, int limit){
        if(n > limit){
            return;
        }
        printReverse(n+1, limit);
        System.out.println(n);
    }
}
