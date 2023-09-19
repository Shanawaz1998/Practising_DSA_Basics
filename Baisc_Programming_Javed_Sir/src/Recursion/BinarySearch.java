package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,4,44,66};
        int target = 44;
        int ans = binSearch(arr,target,0, arr.length-1);
        System.out.println(ans);
    }
    static int binSearch(int a[], int t, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(t == a[m]){
            return m;
        }
        if(t > a[m]){
            return binSearch(a,t,m+1,e);
        }

            return binSearch(a,t,s,m-1);

    }
}
