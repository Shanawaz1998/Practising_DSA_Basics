package Recursion.Subset;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        createSubset("","abc");
        System.out.println(createSubsetInList("","abc"));
    }
    //Printing subset
    static void createSubset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        createSubset(p+ch, up.substring(1));
        createSubset(p, up.substring(1));
    }
    //Returning subset in Arraylist
    static ArrayList<String> createSubsetInList(String p, String up){
        if(up.isEmpty()){
            ArrayList list = new ArrayList();
//            i (!p.isEmpty()){ This edge case is used to avoid the empty space in subsets
                list.add(p);
//            }
            return list;
        }
        char ch = up.charAt(0);
        ArrayList left = createSubsetInList(p+ch, up.substring(1));
        ArrayList right = createSubsetInList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
