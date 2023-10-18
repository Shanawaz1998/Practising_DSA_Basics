package Number_Sorting.MergeSorting;
//Steps

import java.util.Arrays;

//1. Divide the array into 2 parts
//2. Get both the arrays sorted using recursion
//3. Merge both the arrays
public class MergeSort {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int [] mergeSort(int [] a){
        if(a.length == 1){
            return a;
        }
        int mid = a.length/2;

        int left [] = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int right [] = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    static int [] merge(int first[], int second []){
        int mix []= new int [first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the array is not completed
        //Coping the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}
