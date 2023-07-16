package _Comparator_;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);		//compareTo() method is used to compare the data
	}
}
