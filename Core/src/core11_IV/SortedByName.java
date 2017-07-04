package core11_IV;

import java.util.Comparator;

public class SortedByName implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		int res;
		res = o1.getName().compareTo(o2.getName());
		
		return res;
	}

}
