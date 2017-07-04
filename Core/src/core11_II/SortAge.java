package core11_II;

import java.util.Comparator;

public class SortAge implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		
		if (o1.getAge() > o2.getAge())
			return 1;
		if (o1.getAge() < o2.getAge())
			return -1;
		else
			return 0;
	}

}
