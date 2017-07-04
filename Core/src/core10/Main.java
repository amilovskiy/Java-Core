package core10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Car> set = new LinkedHashSet<Car>();
		set.add(new Car("Tesla Motors Inc.", "S", 150000, "red", "jeep", 50, 28, "coffee"));
		set.add(new Car("Ford", "Mustang_70", 70000, "black", "sport", 40, 30, "brown"));
		set.add(new Car("Tesla Motors Inc.", "M", 180000, "white", "sport", 50, 28, "black"));
		
//		Scanner sc = new Scanner(System.in);
//		String filterStr;
//		int filter;
//		int filterII;
		
//		filterStr = sc.nextLine();
//		filter = sc.nextInt();
//		
//		for (Iterator<Car> iter = set.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Body b = c.getBody();
//			Wheels w = c.getWheels();
//			if (b.getColor().equals(filterStr) && w.getDiameter() == filter) {
//				c.changeToElectrocar();
//			}
//		}
//		
//		for (Car c : set) {
//			System.out.println(c);
//		}
		
//		filter = sc.nextInt();
//		filterII = sc.nextInt();
//		
//		for (Iterator<Car> iter = set.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Wheels w = c.getWheels();
//			if (w.getDiameter() >= filter && w.getDiameter() <= filterII) {
//				iter.remove();
//			}
//		}
//		
//		for (Car car : set) {
//			System.out.println(car);
//		}
		
//		filter = sc.nextInt();
//		filterII = sc.nextInt();
//		
//		for (Iterator<Car> iter = set.iterator(); iter.hasNext();) {
//			Car c = iter.next();
//			Wheels w = c.getWheels();
//			if (w.getDiameter() >= filter && w.getDiameter() <= filterII) {
//				System.out.println(c);
//			}
//		}
		
	}
}