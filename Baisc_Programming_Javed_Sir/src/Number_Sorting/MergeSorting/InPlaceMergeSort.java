package Number_Sorting.MergeSorting;

import java.util.Arrays;
//Not understood fully, also not imp much
//This used to sort the same array without using the other array
public class InPlaceMergeSort {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};
        mergeSort(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int a[], int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;

        mergeSort(a, s, mid);
        mergeSort(a, mid, e);

        merge(a,s,mid,e );
    }
    static void merge(int a[], int s,int m, int e){
        int mix [] = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(a[i] < a[j]){
                mix[k] = a[i];
                i++;

            } else {
                mix[k] = a[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the array is not completed
        //Coping the remaining elements
        while(i < m){
            mix[k] = a[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = a[j];
            j++;
            k++;
        }
        for(int l = 0;l<mix.length;l++){
            a[s+l] = mix[l];
        }
    }
}
