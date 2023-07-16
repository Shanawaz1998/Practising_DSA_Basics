package Day7;
//Jagged Array
public class P5 {
	public static void main(String[] args) {
	 int a[][] = new int[4][];   //Inner size is not specified to make it variable,but outer size is compulsory
	 a[0] = new int[3];
	 a[1] = new int[7];
	 a[2] = new int[9];
	 System.out.println(a.length);
	 System.out.println(a[0].length);
	 System.out.println(a[1].length);	 
	}
}
