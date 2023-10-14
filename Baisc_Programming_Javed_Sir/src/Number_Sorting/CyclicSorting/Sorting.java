package Number_Sorting.CyclicSorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int a [] = {4,3,1,2,5};
        int i = 0;
        while(i <a.length){
            int correct = a[i]-1;//If the array starts with 1 then, we need to remove this '-1'.
            if(a[i]<a.length && a[i] != a[correct]){ //To skip the missing number
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
