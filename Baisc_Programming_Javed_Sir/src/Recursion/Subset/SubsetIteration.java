package Recursion.Subset;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.List;

public class SubsetIteration {
    public static void main(String[] args) {
        int arr [] = {1,2,3};
        List<List<Integer>> list = subset(arr);
        for(List l : list){
            System.out.println(l);
        }
    }

    static List<List<Integer>> subset(int a []){
        List<List<Integer>> outer = new ArrayList();
        outer.add(new ArrayList<Integer>()); //Initially creating the empty List inside the outer the list
        for(int num : a){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); //Coping the data from the outer list
                inner.add(num); //Adding the number from the array into the copied list
                outer.add(inner); //merging the array inside the outer array
            }
        }
        return outer;
    }
}
