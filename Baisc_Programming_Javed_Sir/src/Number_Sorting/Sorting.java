package Number_Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int a [] = {3,4,2,1,5};

        int i = 0;
        while(i<a.length){
            int correct = a[i] -1;
            if(a[i] != a[correct]){
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }



//        Brute force
//        for(int i = 0;i<a.length;i++){
//            if(a[i] != i+1){
//                for(int j = 0;j<a.length;j++){
//                    if(a[j] == i+1){
//                        //Swap
//                        int temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//
//                    }
//                }
//
//            }
//        }
        System.out.println(Arrays.toString(a));
    }
}
