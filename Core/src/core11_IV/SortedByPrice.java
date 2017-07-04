package core11_IV;

import java.util.Comparator;

public class SortedByPrice  implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		if (o1.getPrice() > o2.getPrice())
			return 1;
		else if (o1.getPrice() < o2.getPrice())
			return -1;
		else
			return 0;
	}

}
