package Recursion.Patterns;

import java.util.Arrays;
//Similar to patters
public class BubbleSort {
    public static void main(String[] args) {
        int a [] = {4,5,1,3,2};
        sort(a, a.length-1, 0);
        System.out.println(Arrays.toString(a) );
    }
    static void sort(int a [], int arrLength, int startIndex){
        if(arrLength == 0){
            return;
        }
        if(arrLength > startIndex){
            if(a[startIndex] > a[startIndex+1]){
                int temp = a[startIndex];
                a[startIndex] = a[startIndex+1];
                a[startIndex+1] = temp;
            }

            sort(a,arrLength, startIndex+1);
        }
        sort(a,arrLength-1, 0);
    }
}
