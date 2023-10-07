package Recursion.Arrays;

import java.util.Arrays;

//Using Two pointer
public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {4,3,2,1,0};
        reverse(arr, 0, arr.length-1);
        reverse2(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
//    using Two pointer method
    static void reverse(int a[], int s, int e){
        if(s>=e){
            return;
        }
        //swap
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
        reverse(a, s+1,e-1);
    }
    //With less number of arguments
    static void reverse2(int a[], int i){
        if(i >= a.length/2){
            return;
        }
        int temp = a[i];
        a[i] = a[a.length-i-1];
        a[a.length-i-1] = temp;
        reverse2(a, i+1);
    }

}
