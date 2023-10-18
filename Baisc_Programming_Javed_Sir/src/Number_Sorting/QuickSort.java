package Number_Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int a[], int low, int high){//low and high are the extreme ends of the arrays, to know
        //at what range you are working on
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = a[m];

        while (s <= e) {
            while(a[s] < pivot){
                s++;
            }
            while(a[e] > pivot){
                e--;
            }

            if(s<=e){ //if s and e has crossed each other it means, pivot is at the correct position, not need to swap
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }

        sort(a, low, e);
        sort(a, s, high);

    }
}
