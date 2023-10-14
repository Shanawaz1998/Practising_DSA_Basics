package Number_Sorting.CyclicSorting;

//Amazon Asked question
//https://leetcode.com/problems/missing-number/description/
class MissingNumber {
    public static void main(String[] args) {
        int arr [] = {4,3,2,5,0};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] a) {
        int i = 0;
        while(i <a.length){
            int correct = a[i];
            if(a[i]<a.length && a[i] != a[correct]){
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }
        for(int j = 0;j<a.length;j++){
            if(a[j] != j){
                return j;
            }
        }
        return a.length;
    }
}
