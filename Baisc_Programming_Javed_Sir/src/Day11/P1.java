package Day11;

public class P1 {
public static void main(String[] args) {
	String s = "Qspiders";
	System.out.println(s.indexOf('a'));	//If not present it will return -1
	System.out.println(s.startsWith("Qs"));
	System.out.println(s.endsWith("ers"));
	System.out.println(s.isEmpty());
	s = s.replace('s','x');    
	System.out.println(s);
	s = s.replace("id", "ab");
	System.out.println(s);
	System.out.println(s.lastIndexOf('x'));
	
}
}
