package Recursion.StringQuestion;

public class RemoveLetter {
    public static void main(String[] args) {
        String str = "Shanawaz";
//        System.out.println(removeLetter(str,""));
        System.out.println(removeLetterWithSingleArg(str));
    }
    static String removeLetter(String s, String ans){
        if(s.isEmpty()){
            return ans;
        }
        char ch = s.charAt(0);

        if(ch == 'a'){
            return removeLetter(s.substring(1),ans);
        } else {
            return removeLetter(s.substring(1), ans+ch);
        }
    }

    static String removeLetterWithSingleArg(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return removeLetterWithSingleArg(s.substring(1));
        } else {
            return ch + removeLetterWithSingleArg(s.substring(1));
        }
    }
}
