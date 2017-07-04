package core11_IV;

import java.util.Comparator;

public class InverseDefaultSorting implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		int res;
		res = o1.getName().compareTo(o2.getName());
		
		if (res > 1)
			return -1;
		else if (res < 1)
			return 1;
		
		
		if (o1.getPrice() > o2.getPrice())
			return -1;
		else if (o1.getPrice() < o2.getPrice())
			return 1;
		
		res = o1.getProducer().compareTo(o2.getProducer());
		
		if (res > 1)
			return -1;
		else if (res < 1)
			return 1;
		else 
			return 0;
	}

}
