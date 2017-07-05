package core11_IV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {

	List<Commodity> list;
	
	public Menu() {
		super();
	}
	
	public void createCollection() {
		this.list = new ArrayList<Commodity>();
	}
	
	public void addToCollection(String name, int price, String producer) {
		this.list.add(new Commodity(name, price, producer));
	}
	
	public void removeFromCollection(String name) {
		for (Iterator<Commodity> iter = list.iterator(); iter.hasNext();) {
			Commodity c = iter.next();
			if (c.getName().equals(name))
				iter.remove();
		}
	}
	
	public void setCommodityFromCollection(String name, String changeName, int changePrice, String changeProducer) {
		for (Iterator<Commodity> iter = list.iterator(); iter.hasNext();) {
			Commodity c = iter.next();
			if (c.getName().equals(name)) {
				c.setName(changeName);
				c.setPrice(changePrice);
				c.setProducer(changeProducer);
			}
		}
	}
	
	public void rotateCollection(List<Commodity> list) {
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
	}
	
	public void sortCommodityFromCollection() {
		
		System.out.println("====================== SORT COMMODITY ========================");
		System.out.println("1. Default sorting; ");
		System.out.println("2. Sorted by name; ");
		System.out.println("3. Sorted by price; ");
		System.out.println("4. Sorted by producer; ");
		
		int tmp;
		boolean inverseSorting = false;
		String inverseSortingChoice;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		tmp = sc.nextInt();
		
		System.out.println("Use inverse sorting order ?");
		System.out.println("yes OR no");
		
		inverseSortingChoice = sc2.nextLine();
		
		if (inverseSortingChoice.equals("yes"))
			inverseSorting = true;
		
		switch(tmp) {
			case 1:
				if (inverseSorting) {
					Collections.sort(list, new InverseDefaultSorting());
					
					rotateCollection(list);
				} else {
					Collections.sort(list, new DefaultSorting());
					
					rotateCollection(list);
				}
				break;
			
			case 2:
				if (inverseSorting) {
					Collections.sort(list, new InverseSortedByName());
					
					rotateCollection(list);
				} else { 
					Collections.sort(list, new SortedByName());
					
					rotateCollection(list);
				}
				break;
			
			case 3:
				if (inverseSorting) {
					Collections.sort(list, new InverseSortedByPrice());
					
					rotateCollection(list);
				} else { 
					Collections.sort(list, new SortedByPrice());
					
					rotateCollection(list);
				}
				break;
				
			case 4:
				if (inverseSorting) {
					Collections.sort(list, new InverseSortedByProducer());
					
					rotateCollection(list);
				} else { 
					Collections.sort(list, new SortedByProducer());
					
					rotateCollection(list);
				}
				break;
		}
	}
	
}
