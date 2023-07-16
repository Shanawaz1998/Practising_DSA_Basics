package DSA_KunalKushwaha_BS;
import java.util.Arrays;

public class Test {
	
	
public static void main(String[] args) {
	 int arr [] = {8,8,8,3,3,2};
	 int k = 6;
	 int []res  = new int[k];
	res [0] = arr[0];
	for (int i = 1;i<arr.length;i++) {
		if(arr[i] != res[0] && arr[i] != res[i]) {
			for (int j = 1;j<res.length-1;j++) {
				res[j] = arr[i];
				
			}
		}
	}
	System.out.println(Arrays.toString(res));
}
}
