package Recursion.StringQuestion;

public class RemoveString {
    public static void main(String[] args) {
        String str = "bdcapplejskd";
        System.out.println(removeStr(str));
    }
    static String removeStr(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return removeStr(s.substring( 5));
        } else {
            return s.charAt(0) + removeStr(s.substring(1));
        }
    }
}
