package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,5,6};
        int target = 2;
//        System.out.println(searchIndex(arr,0,target));
        System.out.println(search(arr, 0, target));
//        findAllIndexes(arr, 0, target);
//        System.out.println(list);
//        System.out.println(findAllIndexesArrayList(arr, 0, target, new ArrayList<Integer>()));
    }

     static boolean search(int[] arr, int i, int target) {
         if(i == arr.length){
             return false;
         }
         if(arr[i] == target){
             return true;
         }
         return search(arr, i+1, target);
    }

    static int searchIndex(int arr[],int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return searchIndex(arr,i+1,target);
    }


    //If the target is present more than once
    static void findAllIndexes(int arr[], int i, int target){
        if(i == arr.length){
            return;
        }
        if(arr[i] == target){
            list.add(i);
        }
        findAllIndexes(arr,i+1,target);
    }

    //By passing the ArrayList inside the arguments
    static ArrayList<Integer> findAllIndexesArrayList(int arr[], int i, int target, ArrayList listArgs){
        if(i == arr.length){
            return listArgs;
        }
        if(arr[i] == target){
            listArgs.add(i);
        }
        return findAllIndexesArrayList(arr,i+1, target, listArgs);
    }
}
