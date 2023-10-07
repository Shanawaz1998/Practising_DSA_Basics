package Recursion.Patterns;

public class rightAngleTriangle {
    public static void main(String[] args) {
        print(4, 1);
    }
    static void print(int r, int c){
        //Base Case
        if(r == 0){
            return;
        }
        if (r >= c) {
            System.out.print("*");
            print(r, c+1);
        } else {
            System.out.println();
            print(r-1, 1);
        }
    }
}
