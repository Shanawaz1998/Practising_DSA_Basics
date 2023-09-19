package Recursion.Arrays;

public class  SortedArrayCheck {
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,5,6,7,8};
        System.out.println(checkSorted(arr,0));
    }
    static boolean checkSorted(int arr[], int i){
        if(i== arr.length-1){ //As it will not give index array bound exception as it is return from here, when i is equal to the last index
            return true;
        }
        return arr[i]<=arr[i+1] && checkSorted(arr,i+1);
    }
}
