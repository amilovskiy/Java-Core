package core11_II;

import java.util.Comparator;

public class SortName implements Comparator<Human> {

	@Override
	public int compare(Human o1, Human o2) {	
		
		int res = o1.getName().compareTo(o2.getName());
		
		if (res > 1)
			return 1;
		if (res < 1)
			return -1;
		else
			return 0;
	}

}
